package Test_cases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.login_page1;
import pages.login_page2;

public class NukariTestCase {
	public WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\sadhana\\\\selenium_April_22\\\\Binary\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		login_page1 page=new login_page1(driver);
		login_page2 page2=new login_page2(driver);
		page.login();
		page2.login2("sadhanakadam198@gmail.com", "Ssg@7499");
		
		
		
		
	}

}
