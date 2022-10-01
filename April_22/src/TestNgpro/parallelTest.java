package TestNgpro;



import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class parallelTest {

	public WebDriver driver;
  @Test(invocationCount = 2, threadPoolSize = 3)
  public void EdgeTest() 
  {System.setProperty("webdriver.edge.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\msedgedriver.exe");
  driver=new EdgeDriver();
  driver.get("https://www.facebook.com");
  String expectedTitle="Facebook – log in or sign up";
  String ActualTitle=driver.getTitle();
  Assert.assertEquals(ActualTitle, expectedTitle);
  
  WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
  WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
 WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
 usernm.sendKeys("sadhanakadam");
 pass.sendKeys("ssg@123");
 login.click();
 driver.quit();
  
  }
  @Test
  public void ChromeTest()
  {System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.get("https://www.facebook.com");
  String expectedTitle="Facebook – log in or sign up";
  String ActualTitle=driver.getTitle();
  Assert.assertEquals(ActualTitle, expectedTitle);
  
  WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
  WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
 WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
 usernm.sendKeys("sadhanakadam");
 pass.sendKeys("ssg@123");
 login.click();
 driver.quit();
	  
  }
  @Test
  public void FirefoxTest() 
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("https://www.facebook.com");
	  String expectedTitle="Facebook – log in or sign up";
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, expectedTitle);
	  
	  WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	 WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	 usernm.sendKeys("sadhanakadam");
	 pass.sendKeys("ssg@123");
	 login.click();
	 driver.quit();
  }
  
}
