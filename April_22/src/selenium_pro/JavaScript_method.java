package selenium_pro;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_method {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demoqa.com/text-box'");
		
		//sendkeys///vaule
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].value='sadhana kadam'",name);
		
		// for click
		WebElement sumbmit=driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click()", sumbmit);
		
		//alert create
		js.executeScript("alert('welcome to alert')");
		driver.switchTo().alert().accept();
		
		// fetching domain
		
	String domain=	js.executeScript("return document.domain").toString();
		System.out.println("Domain name"+domain);
		
		//typing URL
		String url=js.executeScript("return document.URL").toString();
		System.out.println("Name of the URL="+url);
		
		// fetching Title name
		String Title=js.executeScript("return document.title").toString();
		System.out.println("Name od title="+Title);
		
		//scroll element 
		WebElement scroll=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		//WebElement links=driver.findElement(By.xpath("//span[text()='Links']"));
		//js.executeScript("arguments[0].scrollIntoView(true)", links);
		
		//for refresh
		js.executeScript("location.reload()");
		
		//innter text
		String Text=js.executeScript("return document.documentElement.innerText").toString();
		System.out.println("inner text of the page="+Text);
		
		//String sText=js.executeScript("return document.documentElement.innerText").toString();
		//System.out.println("inner text of the page="+sText);
		

		WebElement logo=driver.findElement(By.xpath(" //img[@src='/images/Toolsqa.jpg']"));
		System.out.println(logo.isDisplayed());
		
		
		
		
	}

}
