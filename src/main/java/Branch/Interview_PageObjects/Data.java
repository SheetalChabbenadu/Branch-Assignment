package Branch.Interview_PageObjects;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Data {
	
	@FindBy(xpath="//a[text()='Data']")
	private WebElement teamData;
	
	
	@FindBy(xpath="//div[@class='info-block']/h2")
	private List<WebElement> empNameList_Data;
	
	@FindBy(xpath="//div[@class='info-block']/h4")
	private List<WebElement> empDeptList_Data;
	
	public int count_data=0;
	public Map<String, String> map_data = new HashMap<String, String>();
	public ArrayList<String> empNames_data = new  ArrayList<String>() ;
	public ArrayList<String> empDepts_data = new ArrayList<String>();
	public HashMap<String,String> newmap_data = new HashMap();
	
	public Data(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Data_Team_Select(){
	
	teamData.click();
	//System.out.println("Data Team");

	for(WebElement data_team_name: empNameList_Data)
	{
				int count=0;
				String data_name=data_team_name.getText();
				if(data_name.length()!=0)
				{	
				empNames_data.add(data_name);
				count++;
				}
		
	}
	

	
	for(WebElement data_team_dept: empDeptList_Data)
	{
	
			String data_dept=data_team_dept.getText();
			if(data_dept.length()!=0)
			{
			empDepts_data.add(data_dept);

			}
		
	}
	

	
	for(int c=0;c<empNames_data.size();c++)
	{
	newmap_data.put(empNames_data.get(c), empDepts_data.get(c));
	
	}
	
	
	for(String name_data:newmap_data.keySet())
	{
	count_data++;
	}
	//System.out.println("Data Team Count" +count_data);
	}
}


