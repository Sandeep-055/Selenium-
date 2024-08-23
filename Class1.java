package sandeep1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ipsosisay.com/en-in/user/login");
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
//		driver.findElement(By.className("btn btn-outline-primary d-none d-lg-inline-block")).click();
//		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys(new CharSequence[] {"sandeep055yerragani@gmail.com"});
		Thread.sleep(3000);
		driver.findElement(By.id("edit-pass")).sendKeys(new CharSequence[] {"Sandeep055##"});
		Thread.sleep(3000);
		driver.findElement(By.id("edit-submit")).click();
		Thread.sleep(2000);
		driver.close();
	
	
	}

}
