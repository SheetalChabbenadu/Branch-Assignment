package Branch.Interview_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Branch.Interview_basic.BaseClassBranch;

public class TestCase6_PageLoad extends BaseClassBranch{
	
	@Test
	public void PageLoadinSameWindow()
	{
		//String title = driver.getTitle();
		driver.navigate().to("https://branch.io/team/#all");
		System.out.println("All team loaded");
		//System.out.println("All" +driver.findElement(By.xpath("//a[@rel='all']")).getAttribute("class"));
		driver.navigate().to("https://branch.io/team/#data");
		//String newTitle = driver.getTitle();
		System.out.println("Data" +driver.findElement(By.xpath("//a[@rel='data']")).getAttribute("class"));
		Assert.assertTrue(driver.findElement(By.xpath("//a[@rel='data']")).getAttribute("class").equals("selected"));
		
		
		driver.close();
		
		
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

}
