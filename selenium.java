package Java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class selenium {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeOptions op=new ChromeOptions();
		//op.addArguments("--remot-allow-orgins=*");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}

}
