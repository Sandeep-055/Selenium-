package sandeep1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.id("login_field")).sendKeys(new CharSequence[] {"sandeep055yerragani@gmail.com"});
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys(new CharSequence[] {"Sandeep055##"} );
		Thread.sleep(3000);
		driver.findElement(By.name("commit")).click();
		Thread.sleep(3000);
		//driver.close();
	}
}
