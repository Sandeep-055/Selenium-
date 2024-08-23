package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.findElement(By.id("name")).sendKeys("sandeep");
        Thread.sleep(3000);
        //switch to other frame1
        driver.switchTo().frame("frm1");
        Select frame1=new Select(driver.findElement(By.id("course")));
        frame1.selectByVisibleText("Java");
        Thread.sleep(3000);
        
        //switch to main document 
        driver.switchTo().defaultContent();
        
        //switch to frame2
        driver.switchTo().frame("frm2");
        driver.findElement(By.id("firstName")).sendKeys("yaragani");
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frm1");
        frame1.selectByVisibleText("Python");
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("yerragani");
        
        Thread.sleep(3000);
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frm1");
        frame1.selectByVisibleText("Dot Net");
        Thread.sleep(3000);
        
        driver.switchTo().defaultContent();
        driver.findElement(By.id("name")).clear();
        driver.findElement(By.id("name")).sendKeys("King");
        
        
        driver.quit();
	}
 
}
//* by using the frame we always use to start the main or defalt frame...this is first step
//*driver.switchTo().defaultContent();
//