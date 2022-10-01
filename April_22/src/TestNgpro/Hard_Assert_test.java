package TestNgpro;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestListner.class)
public class Hard_Assert_test {
	public WebDriver driver;
	 @Test
	  public void edgetest() {
		  System.setProperty("webdriver.edge.driver", "D:\\sadhana\\selenium_April_22\\Binary\\msedgedriver.exe");
		  driver=new EdgeDriver();
		  driver.get("https://kite.zerodha.com");
		  driver.manage().window().maximize();
		 String ExpectedTitle="Kite - Zerodha's fast and elegant flagship trading platform";
		  String ActualTitel=driver.getTitle();
		  Assert.assertEquals(ActualTitel, ExpectedTitle);
		  WebElement logo=driver.findElement(By.xpath("//img[@src='/static/images/kite-logo.svg']"));
		  Assert.assertTrue(logo.isDisplayed());
		  System.out.println(logo.isDisplayed());
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

