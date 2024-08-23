package sandeep.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class impicityWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().setSize(new Dimension(600, 600));
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		driver.findElement(By.id("btn1")).click();
		
		driver.findElement(By.id("txt1")).sendKeys(new CharSequence[] {"sandeep"});
		System.out.println(driver.manage().timeouts().getImplicitWaitTimeout().getSeconds());
		//driver.quit();
		
	}

}
/*implicitlyWait means to wait for finding the element
 * implicitlyWait we can give as must as we
 *there is no time limit
 *but if page take to load after the implicitlyWait its gives an error*/
 