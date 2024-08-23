package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys(new CharSequence[] {"sandeep055yerragani@gmail.com"});
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(new CharSequence[] {"Sandeep055##"} );
		Thread.sleep(3000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		//driver.close();
	}}