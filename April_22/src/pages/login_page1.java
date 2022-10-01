package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page1 {
	WebDriver driver;
	public  login_page1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[text()='Login']")
	WebElement login;
	
	public void login() throws InterruptedException {
		login.click();
		Thread.sleep(5000);
	}
	

}
