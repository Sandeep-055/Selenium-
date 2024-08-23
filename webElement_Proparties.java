package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webElement_Proparties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		System.out.println(driver.findElement(By.id("login_field")).getTagName());
       System.out.println(driver.findElement(By.id("login_field")).getAttribute("type"));
       System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
       System.out.println(driver.findElement(By.name("commit")).getCssValue("font-size"));
       driver.quit();
	}

}
