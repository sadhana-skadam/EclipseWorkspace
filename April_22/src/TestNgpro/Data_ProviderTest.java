package TestNgpro;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Data_ProviderTest {
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String name, String password) {
	  System.setProperty("webdriver.chrome.driver", "D:\\sadhana\\selenium_April_22\\Binary\\chromedriver.exe");
	  		
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  WebElement nm=driver.findElement(By.xpath("//input[@id='email']"));
	  WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	  WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	  nm.sendKeys(name);
	  pass.sendKeys(password);
	  login.click();
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "sadhanakadam198@gmail.com", "Ssg@123" },
      new Object[] { "santoshghodke8888@gmail.com", "SSG@123" },
    };
  }
}
