package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class opinion_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://agencynewui.inopenapp.com/dashboard");
		WebElement  sighIN= driver.findElement(By.xpath("//a[@href=\"/login\"]"));
		sighIN.click();
	}

}
