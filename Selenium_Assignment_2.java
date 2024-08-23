package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Assignment_2 {
	public static void main(String[] args) {
//1)Open a Chrome browser.
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();


		// Navigate to the website
        driver.get("http://www.fb.com");

        // Verify redirection to "http://www.facebook.com"
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.equals("http://www.facebook.com")) {
            System.out.println("Successfully redirected to http://www.facebook.com");
        } else {
            System.out.println("Unexpected redirection. Current URL: " + currentUrl);
        }
        driver.findElement(By.xpath("//a[@id=\"u_0_0_p+\"]")).click();
        // Verify "Create an account" section using XPath
        WebElement createAccountSection = driver.findElement(By.xpath("//input[@name='firstname']"));
        if (createAccountSection.isDisplayed()) {
            System.out.println("Create an account section found.");
        } else {
            System.out.println("Create an account section not found.");
        }

        // Fill in the text boxes using XPath
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("YourFirstName");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("YourLastName");
        driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("you@example.com");
        driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("you@example.com");
        driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("YourPassword");

        // Update date of birth using XPath
        Select dobDay = new Select(driver.findElement(By.xpath("//select[@name='birthday_day']")));
        Select dobMonth = new Select(driver.findElement(By.xpath("//select[@name='birthday_month']")));
        Select dobYear = new Select(driver.findElement(By.xpath("//select[@name='birthday_year']")));

        dobDay.selectByValue("1");
        dobMonth.selectByValue("1");
        dobYear.selectByValue("2000");

        // Select gender using XPath
        driver.findElement(By.xpath("//input[@name='sex']")).click();

        // Click on "Create an account" using XPath
        driver.findElement(By.xpath("//button[@name='websubmit']")).click();

        // Add a delay to wait for the page to load (you may need to adjust the time based on your application)
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Verify account creation success
        if (driver.getCurrentUrl().contains("facebook.com")) {
            System.out.println("Account created successfully.");
        } else {
            System.out.println("Account creation failed.");
        }
         
         
   
	}

}