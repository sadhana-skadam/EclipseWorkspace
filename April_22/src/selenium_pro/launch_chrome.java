package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_chrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\sadhana\\selenium_April_22\\Binary\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		WebElement signin=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		signin.click();
		WebElement name=driver.findElement(By.xpath("//input[@name='email']"));
		name.sendKeys("sadhana kadam");
		
	}

}
