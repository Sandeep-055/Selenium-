package sandeep.Selenium;

import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class pageTime_Load {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Instant startTime=Instant.now();
		System.out.println(startTime.toString());
		//driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.get("https://www.royalmansour.com/en/"); 
		
		Instant endTime=Instant.now();
		System.out.println(endTime.toString());
		Duration duration=Duration.between(startTime, endTime);
		System.out.println("Page Time load :"+ duration.getSeconds()+"seconds");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
/*org.openqa.selenium.TimeoutException: timeout ,When the page is not load at given time its shows this exception.
 * When we can proved negative value in pageLoadTimeout it shows  'InvalidArgumentException': invalid argument*/
