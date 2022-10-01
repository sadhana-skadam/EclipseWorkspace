package selenium_pro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://naukri.com");
			driver.manage().window().maximize();
			
			String mainwindow=driver.getWindowHandle();
			WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
			job.click();
			
			Set<String> childwindows=driver.getWindowHandles();
			Iterator<String> itr=childwindows.iterator();
			while(itr.hasNext()) {
				String child_window=itr.next();
				if(!mainwindow.equalsIgnoreCase(child_window)) {
					driver.switchTo().window(child_window);
					WebElement skills=driver.findElement(By.xpath("//input[@placeholder='Skills, Designations, Companies']"));
					skills.sendKeys("focus on testing");
					
					WebElement search=driver.findElement(By.xpath("//button[text()='Search '] "));
					search.click();
					WebElement recuter=driver.findElement(By.xpath("//div[text()='Recruiters']"));
					recuter.click();
					
					driver.quit();
					//WebElement tools=driver.findElement(By.xpath("//div[text()='Tools']"));
					//tools.click();
					//WebElement login=driver.findElement(By.xpath("//div[@class='btn-container']//following-sibling::a"));
					//login.click();
				}
			}
	}

}
