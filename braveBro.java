package selenium;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class braveBro {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		String parentwindow=driver.getWindowHandle();
		System.out.println("Parent Window Handel"+parentwindow+driver.getTitle());

		driver.findElement(By.id("newWindowBtn")).click();
		
		Set<String>childhandel=driver.getWindowHandles();
		for (String parentwindow1 : childhandel) {
			if(!parentwindow1.equals(parentwindow)) {
				driver.switchTo().window(parentwindow1);
				driver.manage().window().maximize();
				driver.findElement(By.id("firstName")).sendKeys("sandeep");
				Thread.sleep(3000);
				driver.close();
			}
			
		}
		driver.switchTo().window(parentwindow);
		driver.findElement(By.id("name")).sendKeys("nandha");
		Thread.sleep(3000);
		driver.quit();
	}

}
//webdrivermanager.Chromedriver().set();
//Driver.Manage().window().maximize();
//driver.switchTo().window(parentwindow);
//System.out.println(parentwindow +driver.getTitle());
