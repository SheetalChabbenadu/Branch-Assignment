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

	public class Recruiting {
		
		@FindBy(xpath="//a[text()='Recruiting']")
		private WebElement teamRecruiting;
		
		
		@FindBy(xpath="//div[@class='info-block']/h2")
		private List<WebElement> empNameListRecruiting;
		
		@FindBy(xpath="//div[@class='info-block']/h4")
		private List<WebElement> empDeptListRecruiting;
		
		public int count_Recruiting=0;
		public Map<String, String> map_Recruiting = new HashMap<String, String>();
		public ArrayList<String> empNames_Recruiting = new  ArrayList<String>() ;
		public ArrayList<String> empDepts_Recruiting = new ArrayList<String>();
		public HashMap<String,String> newmap_Recruiting = new HashMap();
		
		public Recruiting(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void Recruiting_Team_Select(){
		
		teamRecruiting.click();
		//System.out.println("Recruiting Team");

	
		for(WebElement Recruiting_team_name: empNameListRecruiting)
		{
					int count=0;
					String data_name=Recruiting_team_name.getText();
					if(data_name.length()!=0)
					{	
					empNames_Recruiting.add(data_name);
					
					count++;
					}
			
		}
		
		
		for(WebElement Recruiting_team_dept: empDeptListRecruiting)
		{
		
				String Recruiting_dept=Recruiting_team_dept.getText();
				if(Recruiting_dept.length()!=0)
				{
				empDepts_Recruiting.add(Recruiting_dept);
				
				
				}
			
		}
		
		//System.out.println("moving to hash");
		
		for(int c=0;c<empNames_Recruiting.size();c++)
		{
	
		newmap_Recruiting.put(empNames_Recruiting.get(c), empDepts_Recruiting.get(c));
		
		}
		
		
		for(String name_Recruiting:newmap_Recruiting.keySet())
		{

		count_Recruiting++;
		}
		//System.out.println("Product Team Count" +count_Recruiting);
		}
	}





