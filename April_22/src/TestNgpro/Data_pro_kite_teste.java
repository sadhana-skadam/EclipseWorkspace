package TestNgpro;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class Data_pro_kite_teste {
	@Test(dataProvider = "dp")
	  public void kitelogin(String usernm, String password) {
		  System.setProperty("webdriver.chrome.driver","D:\\sadhana\\selenium_April_22\\Binary\\chromedriver.exe" );
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://kite.zerodha.com");
		  WebElement userid=driver.findElement(By.xpath("//input[@id='userid']"));
		  WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
		  WebElement loginbtn=driver.findElement(By.xpath("//button[@class='button-orange wide']"));
		  userid.sendKeys(usernm);
		  pass.sendKeys(password);
		  loginbtn.click();}
		  		
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "OFB764", "Svg@8888" },
      new Object[] { "XAB345", "Sdk@7499" },
    };
  }}
