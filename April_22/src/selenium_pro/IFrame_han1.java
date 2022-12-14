package selenium_pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrame_han1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("frame1");
		WebElement frame1=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frame1.getText());
		
		
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		WebElement frame2=driver.findElement(By.xpath("//h1[@id='sampleHeading']"));
		System.out.println(frame2.getText());
		
		driver.switchTo().parentFrame();
		WebElement text=driver.findElement(By.xpath("//div[contains(text(),'Sample Iframe page')]"));
		System.out.println(text.getText());
		
		
	}
	
}
