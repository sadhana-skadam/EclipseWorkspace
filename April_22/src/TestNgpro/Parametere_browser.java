package TestNgpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametere_browser {
	public WebDriver driver;
  @Test
  @Parameters({"browser"})
  public void selecbrowser(String browser) {
	  if(browser.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver", "D:\\sadhana\\selenium_April_22\\Binary\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
	  }
	  else if(browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver", "D:\\sadhana\\selenium_April_22\\Binary\\msedgedriver.exe");
		  WebDriver driver=new EdgeDriver();
		  driver.get("https://kite.zerodha.com"); 
	  }
	  
	  
  }
}
