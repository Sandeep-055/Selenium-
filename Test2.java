package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		driver.findElement(By.id("firstName")).sendKeys(new CharSequence[] {"sandeep"});
		driver.findElement(By.id("firstName")).clear();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
