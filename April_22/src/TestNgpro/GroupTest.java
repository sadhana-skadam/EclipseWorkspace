package TestNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupTest {
	WebDriver driver;
  @Test(priority=1,groups={"sanity","regression"})
  public void launch_chrome() {
	  System.setProperty("webdriver.chrome.driver","D:\\sadhana\\selenium_April_22\\Binary\\chromedriver.exe" );
	  driver=new ChromeDriver();
	  driver.get("https://www.facebook.com");
	  System.out.println(driver.getTitle());
  }
  @Test(priority=2,groups = { "regression"})
  public void check_login() {
	  WebElement uname=driver.findElement(By.xpath("//input[@id='email']"));
	  	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	  	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
	  	uname.sendKeys("sadhana kadam");
	  	pass.sendKeys("sdk@123");
	  	login.click();
  }
  @Test(priority=3,groups = "sanity")
  public void check_title() {
	  String expectedtitle="Facebook – log in or sign up";
	  String ActualTitle=driver.getTitle();
	  Assert.assertEquals(ActualTitle, expectedtitle);
	   }
 
  @Test(priority=4,groups="sanity")
  public void Tear_down() {
	  driver.close();
	  
  }
}
