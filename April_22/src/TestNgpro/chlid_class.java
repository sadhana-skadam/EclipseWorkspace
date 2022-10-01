package TestNgpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class chlid_class extends parent_class
{	@Test(dependsOnMethods = "launch_chrome")

	  public void check_login() {
		  WebElement uname=driver.findElement(By.xpath("//input[@id='email']"));
		  	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		  	WebElement login=driver.findElement(By.xpath("//button[@name='login']"));
		  	uname.sendKeys("sadhana kadam");
		  	pass.sendKeys("sdk@123");
		  	login.click();
	  }

}
