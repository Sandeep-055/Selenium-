package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class nagivationToUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys(new CharSequence[] {"instagram"});
		Thread.sleep(3000);
		driver.findElement(By.id("APjFqb")).submit();
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/login/");
		Thread.sleep(3000);
	    driver.findElement(By.id("email")).sendKeys(new CharSequence[] {"9951813155"});
  
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit();
	}

}
