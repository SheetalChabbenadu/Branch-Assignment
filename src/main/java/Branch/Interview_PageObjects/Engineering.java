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

public class Engineering {
	
	@FindBy(xpath="//a[text()='Engineering']")
	private WebElement teamEngineering;
	
	
	@FindBy(xpath="//div[@class='info-block']/h2")
	private List<WebElement> empNameList_Engineering;
	
	@FindBy(xpath="//div[@class='info-block']/h4")
	private List<WebElement> empDeptList_Engineering;
	
	public int count_Engineering=0;
	public Map<String, String> map_Engineering = new HashMap<String, String>();
	public ArrayList<String> empNames_Engineering = new  ArrayList<String>() ;
	public ArrayList<String> empDepts_Engineering = new ArrayList<String>();
	public HashMap<String,String> newmap_Engineering = new HashMap();
	
	public Engineering(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void Engineering_Team_Select(){
	
	teamEngineering.click();
	//System.out.println("Engineering Team");

	
	for(WebElement Engineering_team_name: empNameList_Engineering)
	{
				int count=0;
				String Engineering_name=Engineering_team_name.getText();
				if(Engineering_name.length()!=0)
				{	
				empNames_Engineering.add(Engineering_name);

				count++;
				}

	}
	
	
	for(WebElement Engineering_team_dept: empDeptList_Engineering)
	{
	
			String Engineering_dept=Engineering_team_dept.getText();
			if(Engineering_dept.length()!=0)
			{
			empDepts_Engineering.add(Engineering_dept);

			
			}
		
	}
	

	
	for(int c=0;c<empNames_Engineering.size();c++)
	{

	newmap_Engineering.put(empNames_Engineering.get(c), empDepts_Engineering.get(c));
	
	}
	

	for(String name_Engineering:newmap_Engineering.keySet())
	{
	count_Engineering++;
	}
	
	//System.out.println("Engineering Team Count" +count_Engineering);
	}
}


