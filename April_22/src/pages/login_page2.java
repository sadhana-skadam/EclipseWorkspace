package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login_page2 {
	WebDriver driver;
	
	public  login_page2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@placeholder='Enter your active Email ID / Username']")
	WebElement uname;
	@FindBy(xpath="//input[@placeholder='Enter your password']")
	WebElement pass;
	@FindBy(xpath="//button[text()='Login']")
	WebElement login;
	
	public void login2(String user,String pword ) {
		uname.sendKeys(user);
		pass.sendKeys(pword);
		login.click();
	}

}
