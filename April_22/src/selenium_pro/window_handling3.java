package selenium_pro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handling3 {

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.get("https://www.naukri.com");
			driver.manage().window().maximize();
			
			
			String mainwindow=driver.getWindowHandle();
			WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
			jobs.click();
			
			
			
			Set<String> childwindows=driver.getWindowHandles();
			Iterator<String> itr=childwindows.iterator();
			while(itr.hasNext()) 
			{
				String child_window=itr.next();
				if(!mainwindow.equalsIgnoreCase(child_window)) 
				{
					driver.switchTo().window(child_window);
				}
			}
			WebElement skills=driver.findElement(By.xpath("//input[@placeholder='Enter skills / designations / companies']"));
			skills.sendKeys("selenium");
			
	}

}
