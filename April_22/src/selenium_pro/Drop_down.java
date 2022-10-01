package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_down {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		
	WebElement country=driver.findElement(By.xpath("//select[@name='country_id']"));
		Select sel=new Select(country);
		sel.selectByVisibleText("Haiti");
		
		
		
		
		WebElement country1=driver.findElement(By.xpath("//select[@name='country_id']"));
		sel.selectByValue("6");
		
		WebElement country2=driver.findElement(By.xpath("//select[@name='country_id']"));
		sel.selectByIndex(8);

		
		
	}

}
