package selenium_pro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class window_handl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		String mainwindow=driver.getWindowHandle();
		WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
		job.click();
		
		Set<String> childwindows=driver.getWindowHandles();
		Iterator<String> itr=childwindows.iterator();
		while(itr.hasNext())
		{
			String child_window=itr.next();
			if(!mainwindow.equalsIgnoreCase(child_window))
			{
				driver.switchTo().window(child_window);
				
			}
			WebElement skill=driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"));
			skill.sendKeys("selenium");
		}
	}

		
		
	}

	


