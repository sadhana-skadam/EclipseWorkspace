package TestNgpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowserTest {
	public WebDriver driver;
  @BeforeClass
  @Parameters("browser")
  public void f (String browser) {
	  if(browser.equalsIgnoreCase("gecko")) 
	  { System.setProperty("webdriver.gecko.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
		 
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver","D:\\SadhanaAprill2022\\April_22\\drivers\\msedgedriver.exe");
		  driver=new EdgeDriver();
	  }
	  else if(browser.equalsIgnoreCase("chrome")) {
		 
		  System.setProperty("webdriver.chrome.driver","D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  driver.get("https://www.facebook.com");
	  
	  }
 
}
