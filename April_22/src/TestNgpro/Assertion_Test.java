package TestNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion_Test {
	 public WebDriver driver;
	 
  @Test
  public void setup (){
	  System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
  }
  @Test
  public void Chrometest() {
	  System.setProperty("webdriver.chrome.driver", "D:\\sadhana\\selenium_April_22\\Binary\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  driver.manage().window().maximize();
	 String ExpectedTitle="Facebook – log in or sign up";
	  String ActualTitel=driver.getTitle();
	  Assert.assertEquals(ActualTitel, ExpectedTitle);
  }
 
  
	  
	 
	  
  }
	


