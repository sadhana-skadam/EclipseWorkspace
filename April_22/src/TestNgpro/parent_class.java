package TestNgpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class parent_class {
	WebDriver driver;
	  @Test()
	  public void launch_chrome() {
		  System.setProperty("webdriver.chrome.driver","D:\\sadhana\\selenium_April_22\\Binary\\chromedriver.exe" );
		  driver=new ChromeDriver();
		  driver.get("https://www.facebook.com");
		  System.out.println(driver.getTitle());
	  }

}
