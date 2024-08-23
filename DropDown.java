package sandeep.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(3000);
		WebElement courseName=driver.findElement(By.id("course"));
		Select course=new Select(courseName);
		List<WebElement>courseOption=course.getOptions();
		for (WebElement Option : courseOption) {
			System.out.println(Option.getText());
			
		}
		course.selectByIndex(3);//Python
		Thread.sleep(3000);
		course.selectByValue("java");
		Thread.sleep(3000);
		course.selectByVisibleText("Javascript");
		Thread.sleep(3000);
		String courseselectedname=course.getFirstSelectedOption().getText();
		System.out.println("courseSelectedName ="+courseselectedname);
		
		
		//MultiSelection Method
		
		WebElement ideName=driver.findElement(By.id("ide"));
		Select ide=new Select(ideName);
		List<WebElement>ideoption=ide.getOptions();
		for (WebElement idename : ideoption) {
			System.out.println(idename.getText());
			
		}
		ide.selectByIndex(3);
		Thread.sleep(3000);
		ide.selectByValue("ec");
		Thread.sleep(3000);
		ide.selectByVisibleText("IntelliJ IDEA");
		Thread.sleep(3000);
		ide.deselectByIndex(0);
		Thread.sleep(3000);
		ide.deselectAll();
		
	   List<WebElement> selectedoptions = ide.getAllSelectedOptions();
	   for (WebElement selectedoption : selectedoptions) {
		   System.out.println("selectedoptions are :"+selectedoption.getText());
		
	}
	driver.quit();	
		}

}
