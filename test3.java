package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	 WebDriver driver =new ChromeDriver();
	 driver.get("https://github.com/login");
	 WebElement element=driver.findElement(By.id("login_field"));
	 Thread.sleep(3000);
	 if(element.isEnabled()) {
		 if(element.isDisplayed()) {
			element.sendKeys("sandeepyerragani@gmail.com");
			System.out.println("good to go");
		 }else
			 System.out.println("is not ok");
	 }
	 Thread.sleep(3000);
	 WebElement element1=driver.findElement(By.id("password"));
	 if(element1.isEnabled()) {
		 if(element1.isDisplayed()) {
			element1.sendKeys("sandeep");
			System.out.println("good to go");
		 }else
			 System.out.println("is not ok");
	 

	Thread.sleep(3000);
	driver.findElement(By.className("btn btn-primary btn-block js-sign-in-button")).click();
	 }
}}
