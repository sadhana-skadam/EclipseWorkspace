package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class id_class_taganme_all_locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement usernm=driver.findElement(By.id("email"));
		usernm.sendKeys("sadhana kadam");
		
		WebElement pass=driver.findElement(By.name("pass"));
		pass.sendKeys("Ssg@123");
		
		WebElement login=driver.findElement(By.tagName("button"));
		login.click();
		WebElement fp=driver.findElement(By.tagName("a"));
		fp.click();
				
	}

}
