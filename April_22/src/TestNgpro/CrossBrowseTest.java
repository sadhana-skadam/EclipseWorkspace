package TestNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowseTest {
	public WebDriver driver;
	  @BeforeClass
	  @Parameters("browser")
	  public void f(String browser) {
		  if(browser.equalsIgnoreCase("chrome")) 
		  {
			  System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
			  driver=new ChromeDriver();
		  }
		  else if(browser.equalsIgnoreCase("edge")) 
		  {
			  System.setProperty("webdriver.edge.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\msedgedriver.exe");
			  driver=new EdgeDriver();
		  }
		  else if(browser.equalsIgnoreCase("gecko"));
		  {
			  System.setProperty("webdriver.gecko.driver","D:\\SadhanaAprill2022\\April_22\\drivers\\geckodriver.exe");
			  driver=new FirefoxDriver();
		  }
		  driver.get("https://www.facebook.com");
		  
	  }
	  @Test
	  public void loginfb() {
		  WebElement usernm=driver.findElement(By.xpath("//input[@id='email']"));
		  WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		  WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		  usernm.sendKeys("sadhanakadam");
		  pass.sendKeys("ssg@123");
		  login.click();
	  }
	  @AfterClass
	  public void teardown() {
		  driver.close();
	  }
	  
}
