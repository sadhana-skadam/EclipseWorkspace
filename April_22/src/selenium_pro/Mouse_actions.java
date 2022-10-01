package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		WebElement doubleclick=driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		act.doubleClick(doubleclick).perform();
		WebElement rightclick=driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		act.contextClick(rightclick).perform();
		WebElement click=driver.findElement(By.xpath("//button[text()='Click Me']"));
		act.click(click).perform();
	      WebElement dynamic=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
act.moveToElement(dynamic).perform();
		
		
	}

}
