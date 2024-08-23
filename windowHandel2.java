package sandeep.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandel2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
	String parentWindowHandel=	driver.getWindowHandle();
	System.out.println("parentWindowHandel  ="+parentWindowHandel+driver.getTitle());
	
	driver.findElement(By.id("newWindowsBtn")).click();
	Set<String>windowHandels=driver.getWindowHandles();
	for (String windowHandel : windowHandels) {
		if(!windowHandel.equals(parentWindowHandel)) {
			driver.switchTo().window(windowHandel);
		    driver.findElement(By.name("fName")).sendKeys(new CharSequence[] {"Sandeep"});
			driver.findElement(By.name("lName")).sendKeys(new CharSequence[] {"yaragani"});
			Thread.sleep(3000);
			driver.close();
		}
		}
			Set<String>windowHandels1=driver.getWindowHandles();
			for (String windowHandel1 : windowHandels1) {
				if(!windowHandel1.equals(parentWindowHandel)) {
			driver.switchTo().window(windowHandel1);
			driver.findElement(By.className("fname")).sendKeys(new CharSequence[] {"Sandeep"});
			driver.close();
	
			}
		
		
	}
	driver.quit();
	}
}
