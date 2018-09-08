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

	public class Marketing {
		
		@FindBy(xpath="//a[text()='Marketing']")
		private WebElement teamMarketing;
		
		
		@FindBy(xpath="//div[@class='info-block']/h2")
		private List<WebElement> empNameList_Marketing;
		
		@FindBy(xpath="//div[@class='info-block']/h4")
		private List<WebElement> empDeptList_Marketing;
		
		public int count_Marketing=0;
		public Map<String, String> map_Marketing = new HashMap<String, String>();
		public ArrayList<String> empNames_Marketing = new  ArrayList<String>() ;
		public ArrayList<String> empDepts_Marketing = new ArrayList<String>();
		public HashMap<String,String> newmap_Marketing = new HashMap();
		
		public Marketing(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void Marketing_Team_Select(){
		
		teamMarketing.click();
		//System.out.println("Marketing Team");

		
		for(WebElement Marketing_team_name: empNameList_Marketing)
		{
					int count=0;
					String data_name=Marketing_team_name.getText();
					if(data_name.length()!=0)
					{	
					empNames_Marketing.add(data_name);
					
					count++;
					}
		
		}
		
		
		for(WebElement Marketing_team_dept: empDeptList_Marketing)
		{
		
				String Marketing_dept=Marketing_team_dept.getText();
				if(Marketing_dept.length()!=0)
				{
				empDepts_Marketing.add(Marketing_dept);
				
				
				}
			
		}
		
		//System.out.println("moving to hash");
		
		for(int c=0;c<empNames_Marketing.size();c++)
		{
		
		newmap_Marketing.put(empNames_Marketing.get(c), empDepts_Marketing.get(c));
		
		}
		
		//System.out.println("Name" +"       "+"Designation");
		for(String name_Marketing:newmap_Marketing.keySet())
		{
		count_Marketing++;
		}
		//System.out.println("Marketing Team Count" +count_Marketing);
		}
	}





