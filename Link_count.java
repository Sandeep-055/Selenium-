package sandeep.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link_count {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		try {
			driver.get("");
			int listCount=getLinkCount(driver);
		} finally {
			// TODO: handle finally clause
		} {
	
	}
	}

	private static int getLinkCount(WebDriver driver) {
		// TODO Auto-generated method stub
		return 0;
	}
}
