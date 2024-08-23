package sandeep.Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice {
	/* this method is not work here because of there is no child window or any other windows */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriverManager.chromedriver().setup();
         WebDriver driver=new ChromeDriver();
         WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(10));
         driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
              // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         String parent =driver.getWindowHandle();
        Set<String> chaild= driver.getWindowHandles();
        for (String child : chaild) {
        	if(!child.equals(parent)) {
        		driver.switchTo().window( child);
        		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@id='firstName']")));
        		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(new CharSequence[] {"sandeep"});
        		   
        		driver.close();
        		
        		
        	}
			
		}
	}

}
