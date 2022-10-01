package selenium_pro;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrren_shot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","D:\\SadhanaAprill2022\\April_22\\drivers\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcfile, new File("D:\\SadhanaAprill2022\\April_22\\screenshot\\"+timestamp()+".jpeg"));
	}

	private static String timestamp() {
		// TODO Auto-generated method stub
		return new SimpleDateFormat("yyyy-mm-dd-hh-mm-ss").format(new Date(0));
				
	}

}
