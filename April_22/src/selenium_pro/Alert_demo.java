package selenium_pro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert_demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement alertbtn=driver.findElement(By.xpath("//button[@id='alertButton']"));
	alertbtn.click();
		driver.switchTo().alert().accept();
	WebElement timealertbtn=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
	timealertbtn.click();
		wait.until(ExpectedConditions.alertIsPresent()).accept();
	WebElement confirbtn=driver.findElement(By.xpath("//button[@id='confirmButton']"));
	confirbtn.click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	WebElement prombtn=driver.findElement(By.xpath("//button[@id='promtButton']"));
	
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].click()",prombtn);
	driver.switchTo().alert().sendKeys("sadhana kadam");
	driver.switchTo().alert().accept();
	WebElement abc=driver.findElement(By.xpath("//div[text()='Widgets']"));
	js.executeScript("arguments[0].scrollIntoView(true)", abc);
	}

}
