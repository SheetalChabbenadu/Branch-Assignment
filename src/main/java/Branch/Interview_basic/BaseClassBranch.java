package Branch.Interview_basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BaseClassBranch {

	public WebDriver driver;
	public WebDriver ErrorDriver;
	  @BeforeClass
	  public void preCondition() {
		  	driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://www.google.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.findElement(By.xpath("//input[@title = 'Search']")).sendKeys("Branch");
			
			driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		    driver.findElement(By.xpath("//*[@title='Search']")).sendKeys(Keys.ENTER);
			driver.findElement(By.xpath("//*[@id='rso']//a[contains(text(),'Branch - A mobile linking platform')]")).click();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS); 
			
			if(driver.findElement(By.id("cookiebanner")).isDisplayed())
			{
				driver.findElement(By.id("CybotCookiebotDialogBodyButtonAccept")).click();
			}
			
			js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
			driver.findElement(By.xpath("//a[text()='Team']")).click();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  }
	  @AfterMethod
	  public void closeBrowser(){
		  driver.quit();
	  }
	  }
		


