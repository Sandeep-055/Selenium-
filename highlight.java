package sandeep.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;
public class highlight {
        public static void main(String[] args) throws InterruptedException {
        	
		        WebDriverManager.chromedriver().setup();

		        WebDriver driver = new ChromeDriver();
		        driver.get("https://www.facebook.com/");
		        highligh(driver, driver.findElement(By.xpath("//input[@id=\"email\"]")));
		        highligh(driver, driver.findElement(By.xpath("//input[@id!=\"email\"]")));
		        System.out.println(driver.getCurrentUrl());
		        System.out.println(driver.getTitle());
		        Thread.sleep(3000);
		        driver.quit();
        }
		       public static void highligh (WebDriver driver, WebElement element){
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("arguments[0].setAttribute('style', 'background: orange; border: 2px solid red;');", element);
		}}
		       
   

