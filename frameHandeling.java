package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frameHandeling {

	public static void main(String[] args) throws InterruptedException {
		/*1) In Frames Every time we can Start With default frame its very important.
		  2)in frames we start with default frame so the condition of the frame is -->driver.switchTo().defaultContent();
		  3)and to switchTo the other frames  to use driver.switchTo().frames(); 
		  4)every frame as unique different id */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.findElement(By.id("name")).sendKeys(new CharSequence[] {"sandeep nandha"});
		Thread.sleep(3000);
        driver.switchTo().frame("frm1");
        Select courceName=new Select(driver.findElement(By.id("course")));
        courceName.selectByIndex(2);
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).clear();
        Thread.sleep(3000);
        driver.findElement(By.id("name")).sendKeys(new CharSequence[] {"sandeep Yaragani"});
        
        driver.switchTo().frame("frm1");
        Select courceName1=new Select(driver.findElement(By.id("course")));
        courceName1.selectByVisibleText("Java");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys(new CharSequence[] {"Vinayak varma"});
        Thread.sleep(3000);
        
        
        driver.quit();
	}

}
