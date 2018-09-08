package Branch.Interview_TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import Branch.Interview_basic.BaseClassBranch;

//to verify if the Twitter Page and Git Hub Page is opened for resource 'Mada Seghete'

public class TestCase5_TwitterPage extends BaseClassBranch {
	
	@Test
	public void TwitterPage(){
		
		driver.findElement(By.xpath("//div[@class='info-block']/h2[text()='Mada Seghete']/../a[1]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String pageTitle = driver.getCurrentUrl();
		String userName = driver.findElement(By.xpath("//*[@id='page-container']//h1[@class='ProfileHeaderCard-name']/a[text()='Mada Seghete']")).getText();
		
		Assert.assertTrue(pageTitle.equals("twitter"));
		Assert.assertTrue(userName.equals("Mada Seghete"));
		driver.close();
		
		
	}

}
