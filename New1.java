package selenium;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
public class New1 {

	public static void main(String[] args) throws InterruptedException {
		// TO 2 arguments for chrome only
		ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.ipsosisay.com/en-in");
		Thread.sleep(3000);
		
        driver.quit();
	}

}
