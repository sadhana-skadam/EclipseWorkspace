package TestNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class kite_test {
	@Test(dataProvider = "dp",dataProviderClass = Data_test.class)
	  public void kitelogin(String usernm, String password) {
		  System.setProperty("webdriver.chrome.driver","D:\\\\sadhana\\\\selenium_April_22\\\\Binary\\\\chromedriver.exe" );
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		  WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement loginbtn=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  userid.sendKeys(usernm);
		  pass.sendKeys(password);
		  loginbtn.click();
		  		
	}
}
