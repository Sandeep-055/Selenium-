package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class NavigationToGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.findElement(By.className("gLFyf")).sendKeys("sandeep");
        Thread.sleep(3000);
        driver.findElement(By.className("gLFyf")).submit();
        Thread.sleep(3000);
        driver.navigate().to("https://www.ipsosisay.com/en-in/user/login");
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
      
	}

}
