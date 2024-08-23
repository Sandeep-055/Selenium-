package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test12 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(new CharSequence [] {"Admin"});
//		driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(new CharSequence [] {"admin123"});
//		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//input[@placeholder!=\"Last Name\"]")).sendKeys(new CharSequence[] {"sandeep"});
		driver.findElement(By.xpath("//input[@placeholder=\"Last Name\"]")).sendKeys(new CharSequence[] {"yaragani"});
		driver.findElement(By.xpath("//textarea[@ng-model=\"Adress\"]")).sendKeys(new CharSequence[] {"1-38,Bapu Nagar,SR NAGAR,Hyderabad"});
		driver.findElement(By.xpath("//input[@ng-model=\"EmailAdress\"]")).sendKeys(new CharSequence[] {"sandeepyerragani@gmail.com"});
		driver.findElement(By.xpath("//input[@ng-model=\"Phone\"]")).sendKeys(new CharSequence[] {"9951813155"});
		driver.findElement(By.xpath("//input[@name=\"radiooptions\"]")).click();
	    driver.findElement(By.id("checkbox1")).click();
	    driver.findElement(By.id("checkbox2")).click();	
		driver.close();
		}

}
