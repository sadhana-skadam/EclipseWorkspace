package TestNgpro;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class browser_parameterization {
  @Test
  @Parameters("browser")
  public void Chrome(String browser) {
	  if(browser.equalsIgnoreCase("chrome")){
		  System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		  
	  }
	  else if(browser.equalsIgnoreCase("edge")){
		  System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver(); 
		  driver.get("https://kite.zerodha.com");
	  }
	  
	  
	  
	  
  }
  
}
