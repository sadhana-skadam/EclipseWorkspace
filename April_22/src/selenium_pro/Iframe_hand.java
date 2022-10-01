package selenium_pro;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe_hand {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("D:\\SadhanaAprill2022\\April_22\\Screenshot\\"+timestamp()+".jpeg"));
		

	}

	private static String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("YYYY-MM-DD-HH-MM-SS").format(new Date());
	}

	
	
	
	
	

}
