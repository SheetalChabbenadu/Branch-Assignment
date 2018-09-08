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

	public class Operations {
		
		@FindBy(xpath="//a[text()='Operations']")
		private WebElement teamOperations;
		
		
		@FindBy(xpath="//div[@class='info-block']/h2")
		private List<WebElement> empNameList_Operations;
		
		@FindBy(xpath="//div[@class='info-block']/h4")
		private List<WebElement> empDeptList_Operations;
		
		public int count_Operations=0;
		public Map<String, String> map_Operations = new HashMap<String, String>();
		public ArrayList<String> empNames_Operations = new  ArrayList<String>() ;
		public ArrayList<String> empDepts_Operations = new ArrayList<String>();
		public HashMap<String,String> newmap_Operations = new HashMap();
		public Operations(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void Operations_Team_Select(){
		
		teamOperations.click();
		//System.out.println("Marketing Team");

		for(WebElement Operations_team_name: empNameList_Operations)
		{
					int count=0;
					String data_name=Operations_team_name.getText();
					if(data_name.length()!=0)
					{	
					empNames_Operations.add(data_name);
					
					count++;
					}
			
		}
		
		
		for(WebElement Operations_team_dept: empDeptList_Operations)
		{
		
				String Operations_dept=Operations_team_dept.getText();
				if(Operations_dept.length()!=0)
				{
				empDepts_Operations.add(Operations_dept);
				
				}
			
		}
		
		//System.out.println("moving to hash");
		
		for(int c=0;c<empNames_Operations.size();c++)
		{
		
		newmap_Operations.put(empNames_Operations.get(c), empDepts_Operations.get(c));
		
		}
		
		
		for(String name_Operations:newmap_Operations.keySet())
		{
	
		count_Operations++;
		}
		//System.out.println("Operations Team Count" +count_Operations);
		}
	}





