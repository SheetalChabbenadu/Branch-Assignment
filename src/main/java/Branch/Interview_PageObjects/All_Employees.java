package Branch.Interview_PageObjects;

	import java.util.ArrayList;
	import java.util.HashMap;
	import java.util.List;
	import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

	public class All_Employees {
		
		@FindBy(xpath="//a[text()='All']")
		private WebElement teamAll_Employees;
		
		
		@FindBy(xpath="//div[@class='info-block']/h2")
		private List<WebElement> empNameListAll_Employees;
		
		@FindBy(xpath="//div[@class='info-block']/h4")
		private List<WebElement> empDeptListAll_Employees;
		

		
		public int count_All_Employees=0;
		public Map<String, String> map_All_Employees = new HashMap<String, String>();
		public ArrayList<String> empNames_All_Employees = new  ArrayList<String>() ;
		public ArrayList<String> empDepts_All_Employees = new ArrayList<String>();
		public HashMap<String,String> newmap_All_Employees = new HashMap();
		
		public All_Employees(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			
		}
		
		public void All_Employees_Team_Select(){

		 int ncount=0;
		for(WebElement All_Employees_team_name: empNameListAll_Employees)
		{
					
					String data_name=All_Employees_team_name.getText();
					empNames_All_Employees.add(data_name);
					//System.out.println(data_name);
					ncount++;
	
		}

		
		for(WebElement All_Employees_team_dept: empDeptListAll_Employees)
		{
		
				String All_Employees_dept=All_Employees_team_dept.getText();
				empDepts_All_Employees.add(All_Employees_dept);

		}
		
		//System.out.println("moving to hash");
		
		for(int c=0;c<empNames_All_Employees.size();c++)
		{
		//System.out.println(empNames_data.get(c)+""+ empDepts_data.get(c));
		newmap_All_Employees.put(empNames_All_Employees.get(c), empDepts_All_Employees.get(c));
		
		}
		

		for(String name_All_Employees:newmap_All_Employees.keySet())
		{
		count_All_Employees++;
		}
		//System.out.println("All Team Count" +count_All_Employees);
		}
		
		
	
		public void ErrorScreen(WebDriver driver){
			WebDriverWait wait=new WebDriverWait(driver, 20);
			WebElement check = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'404 page')]")));
			WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'404 page')]"));
			Assert.assertTrue(errorMessage.isDisplayed());
		}
		
	}





