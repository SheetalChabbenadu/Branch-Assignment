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

	public class Partner_Growth {
		
		@FindBy(xpath="//a[text()='Partner Growth']")
		private WebElement teamPartner_Growth;
		
		
		@FindBy(xpath="//div[@class='info-block']/h2")
		private List<WebElement> empNameList_Partner_Growth;
		
		@FindBy(xpath="//div[@class='info-block']/h4")
		private List<WebElement> empDeptList_Partner_Growth;
		
		
		public int count_Partner_Growth=0;
		public Map<String, String> map_Partner_Growth = new HashMap<String, String>();
		public ArrayList<String> empNames_Partner_Growth = new  ArrayList<String>() ;
		public ArrayList<String> empDepts_Partner_Growth = new ArrayList<String>();
		public HashMap<String,String> newmap_Partner_Growth = new HashMap();
		
		public Partner_Growth(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void Partner_Growth_Team_Select(){
		
		teamPartner_Growth.click();
		//System.out.println("Partner_Growth Team");
		
		
		for(WebElement Partner_Growth_team_name: empNameList_Partner_Growth)
		{
					int count=0;
					String data_name=Partner_Growth_team_name.getText();
					if(data_name.length()!=0)
					{	
					empNames_Partner_Growth.add(data_name);
					
					count++;
					}
		
		}
		
		
		for(WebElement Partner_Growth_team_dept: empDeptList_Partner_Growth)
		{
		
				String Partner_Growth_dept=Partner_Growth_team_dept.getText();
				if(Partner_Growth_dept.length()!=0)
				{
				empDepts_Partner_Growth.add(Partner_Growth_dept);
				
				}
			
		}
		
		//System.out.println("moving to hash");
		
		for(int c=0;c<empNames_Partner_Growth.size();c++)
		{
		newmap_Partner_Growth.put(empNames_Partner_Growth.get(c), empDepts_Partner_Growth.get(c));
		
		}
		
		
		for(String name_Partner_Growth:newmap_Partner_Growth.keySet())
		{
		count_Partner_Growth++;
		}
		//System.out.println("Partner_Growth Team Count" +count_Partner_Growth);
		}
	}





