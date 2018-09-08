package Branch.Interview_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Branch.Interview_PageObjects.All_Employees;
import Branch.Interview_basic.BaseClassBranch;

public class TestCase4_ErrorPage {
	
	@Test
	public void ErrorPageDisplay()
	{
		
		WebDriver ErrorDriver = new ChromeDriver();
		ErrorDriver.get("https://branch.io/team/all");
		All_Employees all_emp = new All_Employees(ErrorDriver);
		//driver.navigate().to("https://branch.io/team/all");
		
		all_emp.ErrorScreen(ErrorDriver);
		
		ErrorDriver.close();
	}
	
	

}
