package sandeep.Selenium;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.primitives.Bytes;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenShot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		// WebDriver driver=new ChromeDriver();
		// RemoteWebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://www.google.com/");
//	   //File Format 
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
//        String destinationPath = "C:\\Users\\HP\\eclipse-workspace\\Selenium\\ScreenShot/sandeep.png";
//        try {
//            FileUtils.copyFile(sourceFile, new File(destinationPath));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("sceenshot saved sucessfully");
//		driver.quit();

		// Bytes
//		TakesScreenshot ts = (TakesScreenshot) driver;
//		byte[] arrySource=ts.getScreenshotAs(OutputType.BYTES);
//		String sourceFile ="C:\\\\Users\\\\HP\\\\eclipse-workspace\\\\Selenium\\\\ScreenShot/Vinay.png";
//		FileOutputStream fc=new FileOutputStream(sourceFile);
//		fc.write(arrySource);
//		fc.close();
//			System.out.println("ScreenShot Tacken SucessFully");
//		driver.quit();

//		//Base64 method
//		TakesScreenshot ts = (TakesScreenshot) driver;//Casting
//	    String sourceFile=ts.getScreenshotAs(OutputType.BASE64);
//	    byte[] arrySource=Base64.getDecoder().decode(sourceFile);
//	    String destFile="C:\\Users\\HP\\eclipse-workspace\\Selenium\\ScreenShot/nani.png";
//	    
//	    FileOutputStream fc=new FileOutputStream(destFile);
//	    fc.write(arrySource);
//	    fc.close();
//	    System.out.println("ScreenSot Taken SucessFully");
//	    driver.quit();
		// Base64 method
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String sourceFile = driver.getScreenshotAs(OutputType.BASE64);
		byte[] arrySource = Base64.getDecoder().decode(sourceFile);
		String destFile = "C:\\Users\\HP\\eclipse-workspace\\Selenium\\ScreenShot/nani1.png";

		FileOutputStream fc = new FileOutputStream(destFile);
		fc.write(arrySource);
		fc.close();
		System.out.println("ScreenSot Taken SucessFully");
		driver.quit();

	}

}

/*
 * if we can use WebDriver we can add TakesScreenshot ts = (TakesScreenshot).
 * driver;//Casting method if we can use ChromeDriver there is no need for
 * casting method it's take what we create object for ChromeDriver Not Only
 * ChromeDriver Its use for all driver Methods expect WebDriver.
 * 
 */
