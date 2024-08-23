package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class sandeep1 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.ipsosisay.com/en-in");
		driver.findElement(By.xpath("//a[@href=\"/en-in/user/login\"]")).click();
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		WebElement element=(WebElement) jc.executeScript("document.getElementById(\"edit-name\");");
		element.sendKeys("sandeep055yerragani@gmail.com");
		
	}


}
