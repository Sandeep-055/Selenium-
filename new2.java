package sandeep.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class new2 {
    public static void main(String[] args) {
    	WebDriverManager.chromedriver().setup();
    	WebDriver driver=new ChromeDriver();
    	driver.navigate().to("https://www.facebook.com/");
	
		JavascriptExecutor jc=(JavascriptExecutor)driver;
		WebElement element =(WebElement) jc.executeScript(" return document.getElementById('email')");
		element.sendKeys(new CharSequence[] {"sandeep"});
		//element.clear();
		System.out.println(element.getText());
		driver.quit();
		
	}

}
