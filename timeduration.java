package selenium;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class timeduration {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		Instant starttime=Instant.now();
		System.out.println(starttime.toString());
		driver.get("https://www.google.com/");
		
		Instant endtime=Instant.now();
		System.out.println(endtime.toString());
		Duration duration=Duration.between(starttime, endtime);
		System.out.println("time differance :"+duration.getSeconds());
		System.out.println(driver.getTitle());
		driver.quit();
		
		//Implicit timeout
		WebDriver driver1=new ChromeDriver();
		driver1.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		//optional
		driver1.manage().window().setSize(new Dimension(1000,1000));
		
		driver1.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver1.findElement(By.id("btn1")).click();
		driver1.findElement(By.id("txt1")).sendKeys("sandeep");
		driver1.quit();
		
		
		
		
	}

}
