package sandeep.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.List;

public class Selenium_Assinement3 {
	


	    public static void main(String[] args) {
	        // Set the path to your ChromeDriver executable
	       WebDriverManager.chromedriver().setup();

	        // Open Chrome browser
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Navigate to the Flipkart website
	            driver.get("https://flipkart.com");

	            // Get link count on the homepage
	            int linkCount = getLinkCount(driver);
	            System.out.println("Number of links on the homepage: " + linkCount);

	            // Print link text and URLs
	            printLinkInfo(driver);

	        } finally {
	            // Close the browser
	            if (driver != null) {
	                driver.quit();
	            }
	        }
	    }

	    private static int getLinkCount(WebDriver driver) {
	        // Find and return the count of links on the homepage
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        return links.size();
	    }

	    private static void printLinkInfo(WebDriver driver) {
	        // Find and print link text along with URLs
	        List<WebElement> links = driver.findElements(By.tagName("a"));
	        System.out.println("Link text and URLs:");
	        for (WebElement link : links) {
	            String linkText = link.getText();
	            String linkUrl = link.getAttribute("href");
	            System.out.println("Text: " + linkText + ", URL: " + linkUrl);
	        }
	    }
	}
