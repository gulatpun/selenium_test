package ultimatixLogin1.ultimatixLogin1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ultimatixLogin1
{
	public WebDriver driver; 
	
  @BeforeTest
  public void launchBrowser() 
  {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\RISKCON\\Desktop\\Selenium_Java\\chromedriver\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.get("https://www.ultimatix.net/");
  }
  
  @Test
  public void login()
  {
	  WebElement we = driver.findElement(By.cssSelector("#USER"));
	  we.sendKeys("1211818");
	  we=driver.findElement(By.cssSelector("#PASSWORD"));
	  we.sendKeys("Mehta@12345");
	  we=driver.findElement(By.cssSelector("#login_button"));
	  we.click();
	  we=driver.findElement(By.cssSelector("#uam_modal"));
	  we.click();
	  we=driver.findElement(By.cssSelector("#logoutbutton"));
	  we.click();
  }
}
