package sandeep.Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_assignment4 {
//	Open any browser of your choice (Mozilla firefox, Chrome, Internet Explorer or Safari). Write the code in such a way that based on argument passed respective browser is selected.
//	Browse to https://in.ebay.com/ website.
//	Enter a product in the search box on the homepage (say Apple Watches).
//	From categories dropdown, select category of your product (say Electronics).
//	Click the Search button.
//	Write a method to print the result of the product.
//	Write a method to print Nth product say 10th Product. (This should be a generic method)
//	Write a method to print all products from 1st page.
//	Write a method to print all products along with scroll down.
	
    public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@id=\"gh-ac\"]")).sendKeys("Apple Watches");
		
//		driver.findElement(By.linkText("Electronics")).click();
		
		WebElement dropdown = driver.findElement(By.id("gh-cat"));
		Select selectCategory = new Select(dropdown);
		
		selectCategory.selectByVisibleText("Cell Phones & Accessories");
		
		driver.findElement(By.id("gh-btn")).click();
		
		
		String resultList=driver.findElement(By.className("\"srp-controls__count-heading\"")).getText();
		System.out.println(resultList);
    }}

//class="srp-controls__count-heading"


