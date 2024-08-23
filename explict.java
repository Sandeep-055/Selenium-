package sandeep.Selenium;

import java.lang.annotation.Annotation;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.github.bonigarcia.wdm.WebDriverManager;

public class explict {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1000, 1000));
		//WebDriverWait method
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10), Duration.ofMillis(500));
		//FluentWait method
		FluentWait<WebDriver>wait =new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(10));
		
		driver.get("https://testproject.io/");
		String prentwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Login")).click();
		Set<String> childwindows = driver.getWindowHandles();
		for (String childwindow : childwindows) {
			if (!childwindow.equals(prentwindow)) {
				driver.switchTo().window(childwindow);
				// spot action we can use this method
//				Function<WebDriver, Boolean> f = new Function<WebDriver, Boolean>() {
//					@Override
//					public Boolean apply(WebDriver webdriver) {
//
//						return webdriver.findElement(By.id("username")).isDisplayed();
//						// return webdriver.findElement(By.id("username")).isEnabled();
//
//					}
//				};
//				wait.until(f);
				//Lambda expiration 
				wait.until(d->d.findElement(By.id("username")).isDisplayed());
				// its wait until the nanoseconds condition over
				// wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
				driver.findElement(By.id("username")).sendKeys(new CharSequence[] { "QA Testing " });

				driver.quit();
			}

		}
	}
}
