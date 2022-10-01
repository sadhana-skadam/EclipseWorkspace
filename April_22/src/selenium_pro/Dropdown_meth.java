package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_meth {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		/*WebElement country=driver.findElement(By.xpath("//select[@id='input-country']"));
		Select abc=new Select(country);
		abc.selectByVisibleText("Haiti");*/
		
		
		
		/*WebElement country=driver.findElement(By.xpath("//select[@name='country_id']"));
		Select acx=new Select(country);
		acx.selectByIndex(9);*/
		
		WebElement country=driver.findElement(By.xpath("//select[@name='country_id']"));
		Select bc=new Select(country);
		bc.selectByValue("5");
	}

}
