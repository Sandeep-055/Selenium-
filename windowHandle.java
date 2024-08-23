package sandeep.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String perentwindowHandel=driver.getWindowHandle();
		System.out.println("perentwindowHandel  :"+perentwindowHandel+driver.getTitle());
		driver.findElement(By.className("whButtons")).click();
		Set<String> windowHandels=driver.getWindowHandles();
		for (String windowHandel : windowHandels) {
			if(!windowHandel.equals(perentwindowHandel)) {
			driver.switchTo().window(windowHandel);
			driver.manage().window().maximize();
			driver.findElement(By.id("firstName")).sendKeys(new CharSequence[] {"pavan"});
			Thread.sleep(3000);
			
			System.out.println("windowHandel is"+windowHandel+driver.getTitle());
			driver.close();
			}
		}
		driver.switchTo().window(perentwindowHandel);
		//driver.findElement(By.id("name")).clear();
		driver.findElement(By.id("name")).sendKeys(new CharSequence[] {"Vinayak Varma"});
		Thread.sleep(4000);
		driver.quit();
	}
}
