package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class IsayLogin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 ChromeOptions op=new ChromeOptions();
		 op.addArguments("--remot-allow-origins=*");
		 WebDriver driver =new ChromeDriver(op);
		 
		 
		 driver.get("https://www.ipsosisay.com");
		 WebElement element=driver.findElement(By.id("edit-name"));
		 Thread.sleep(3000);
		 if(element.isEnabled()) {
			 if(element.isDisplayed()) {
				element.sendKeys("sandeep055yerragani@gmail.com");
				System.out.println("good to go");
			 }else
				 System.out.println("is not ok");
		 }
		 Thread.sleep(3000);
		 WebElement element1=driver.findElement(By.id("edit-pass"));
		 if(element1.isEnabled()) {
			 if(element1.isDisplayed()) {
				element1.sendKeys("Sandeep055##");
				System.out.println("good to go");
			 }else
				 System.out.println("is not ok");
		 

		Thread.sleep(3000);
		driver.findElement(By.id("edit-submit")).click();
		
		System.out.println("sucessfully login");
		 }

	}

}
