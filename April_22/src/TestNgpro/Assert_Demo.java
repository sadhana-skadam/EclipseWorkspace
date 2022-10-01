package TestNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Demo {
	public WebDriver driver;
	@Test
	public void ChromTest() {
		System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		
		WebElement logo=driver.findElement(By.xpath("//img[@class='fb_logo _8ilh img']"));
		Assert.assertTrue(logo.isDisplayed());
		
		String ExpectedTitle="Facebook – log in or sign up";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
				
	}

}
