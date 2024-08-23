package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class openCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		 driver.manage().window().maximize();
		 
		 driver.get("https://ipsosisay.com/");
	     
		 //get url
		 String url=driver.getCurrentUrl();
		 System.out.println("Current URL ="+url);
		 
		 //get Title
		  String Title=driver.getTitle();
		  System.out.println("Current Title ="+Title);
		  
		  //get page source
		  
		  String pageSource=driver.getPageSource();
		  System.out.println("Current PageSource ="+pageSource);
		  driver.quit();
	}

}
