package sandeep.Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowHandle1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
	//	driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
	
		
		String parentHandel=driver.getWindowHandle();
		System.out.println("parentHandel :"+parentHandel+driver.getTitle());
		//driver.findElement(By.id("name")).sendKeys(new CharSequence[] {"Sandeep"});
		driver.findElement(By.id("newTabBtn")).click();
		Set<String>windowHandels=driver.getWindowHandles();
		for (String windowHandel : windowHandels) {
			if(!windowHandel.equals(parentHandel)) {
				driver.switchTo().window(windowHandel);
				driver.findElement(By.id("alertBox")).click();
				System.out.println("The alert Msg Is :"+driver.switchTo().alert().getText());
			driver.switchTo().alert().accept();
			System.out.println(driver.findElement(By.id("output")).getText());	
			Thread.sleep(3000);
			driver.close();
			}}
			driver.switchTo().window(parentHandel);
			//driver.findElement(By.id("name")).clear();
			driver.findElement(By.id("name")).sendKeys(new CharSequence[] {"yaragani"});
			Thread.sleep(3000);
			driver.quit();
					
	}

}
