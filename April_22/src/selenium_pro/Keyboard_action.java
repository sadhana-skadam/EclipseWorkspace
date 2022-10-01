package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.w3c.dom.svg.SVGViewElement;

public class Keyboard_action {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/text-box");;
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		WebElement uname=driver.findElement(By.xpath("//input[@id='userName']"));
		act.sendKeys(uname, "sadhana kadam");
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("sadhanakadam198@gmail.com" ).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("At post Rametakali,tq=manwat,dist=parbhani").perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.build().perform();
		act.keyUp(Keys.CONTROL);
		act.sendKeys(Keys.TAB).perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.build().perform();
		act.keyUp(Keys.CONTROL).perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys(Keys.ENTER).perform();
		WebElement forms =driver.findElement(By.xpath("//div[text()='Forms']"));
		act.scrollToElement(forms);
		
		
		
		
		
		

	}

}
