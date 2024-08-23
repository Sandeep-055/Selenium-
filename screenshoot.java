package selenium;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class screenshoot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		  
		//file
		File ssFile = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
		File ssFile1=new File("./ScreenShot/img1.png");
		System.out.println("is ok");
		driver.quit();
	}

}
