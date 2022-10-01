package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement countryele=driver.findElement(By.xpath("//select[@name='country_id']"));
		Select country=new Select(countryele);
	
		//country.selectByVisibleText("Haiti");
		//country.selectByValue("10");
		country.selectByIndex(3);
		
	}

}
