package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class java_Script_method {

	public static void main(String[] args) {
		//methods of javascript
				//alert create
				//click
				//value
				//scrollIntoView
				//innerText
				//URL
				//domain
				//isdisplayed
				//titlename.....title
				// location.refresh
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.location='https://demoqa.com/text-box'");
		
		//click
		WebElement name=driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].click()", name);
		
		//value
		WebElement name1=driver.findElement(By.xpath("//input[@id='userName']"));
		js.executeScript("arguments[0].value='sadhanakadam'", name1);
		
		//alert create
		js.executeScript("alert('welcome to javascript method')");
		driver.switchTo().alert().accept();
		
		//url
		String url=js.executeScript("return document.URL").toString();
		System.out.println("name of the url="+url);
		
		//domain
		String domain=js.executeScript("return document.domain").toString();
		System.out.println("name of the domain="+domain);
		
		
		//title
		String Title=js.executeScript("return document.title").toString();
		System.out.println("name of the Title="+Title);
		
		//refresh
		
		js.executeScript("location.reload()");
		
		
		
		//INNERTEXT
		String Text=js.executeScript("return document.documentElement.innerText").toString();
		System.out.println("name of innerText="+Text);
		
		
		//scrooIntoview
		
		WebElement dynamic=driver.findElement(By.xpath("//span[text()='Dynamic Properties']"));
		js.executeScript("arguments[0].scrollIntoView(true)", dynamic);
		
		
	}

}
