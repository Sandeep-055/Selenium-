package sandeep.Selenium;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explict_Wait {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().setSize(new Dimension(600, 600));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30)); // Wait for a maximum of 10 seconds
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		Instant startTime=Instant.now();
		System.out.println(startTime.toString());
		driver.findElement(By.id("btn2")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));
		driver.findElement(By.id("txt2")).sendKeys(new CharSequence[] { "sandeep" });
		Instant endTime=Instant.now();
		System.out.println(endTime.toString());
		Duration duration=Duration.between(startTime, endTime);
		System.out.println("Page Time load :"+ duration.getSeconds()+"seconds");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
