package selenium_pro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_shot2 {

	public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	File srcfile=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(srcfile, new File("D:\\SadhanaAprill2022\\April_22\\screenshot\\XYZ.jpeg"));
	

	}

}
