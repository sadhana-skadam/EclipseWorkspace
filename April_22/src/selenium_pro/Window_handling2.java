package selenium_pro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handling2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		String mainwindow=driver.getWindowHandle();
		Thread.sleep(2000);
		WebElement jobs=driver.findElement(By.xpath("//div[text()='Jobs']"));
		jobs.click();
		
		Set<String> childwindows=driver.getWindowHandles();
		Iterator<String> its=childwindows.iterator();
		while(its.hasNext()) 
		{
			String child_window=its.next();
			if(!mainwindow.equalsIgnoreCase(child_window)) 
			{
				driver.switchTo().window(child_window);
			}
			WebElement serv=driver.findElement(By.xpath("//div[text()='Services']"));
			serv.click();
			
			
		}
	}

}
