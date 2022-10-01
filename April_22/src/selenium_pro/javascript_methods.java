package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript_methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demoqa.com/text-box'");
		
		//sendkeys=value
		WebElement fullnm=driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].value='sadhana kadam'",fullnm);
		
		//click
		WebElement submit=driver.findElement(By.xpath("//button[@id='submit']"));
		js.executeScript("arguments[0].click()",submit);
		
		
		//scrollintoview
		
		WebElement abc=driver.findElement(By.xpath("//span[text()='Upload and Download']"));
		js.executeScript("arguments[0].scrollIntoView(true)", abc);
		
		//Domain name
		String domain=js.executeScript("return document.domain").toString();
		System.out.println("domain name"+domain);
		
		
		//titalname
		String title=js.executeScript("return document.title").toString();
		System.out.println("titalname="+title);
		
		
		//innerText
		String text=js.executeScript("return document.documentElement.innerText").toString();
		System.out.println("inner text"+text);
		
		//refresh
		
		js.executeScript("location.reload()");
		
		
		//url
		String URL=js.executeScript("return document.URL").toString();
		System.out.println("type url="+URL);
		
		
		
		
		//Alert hanle
		
		js.executeScript("alert('welcome to alert')");
		driver.switchTo().alert().accept();
		
	}

}
