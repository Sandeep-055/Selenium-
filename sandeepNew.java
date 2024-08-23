package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class sandeepNew {

	public static void main(String[] args) {
		ChromeOptions op=new ChromeOptions();
		op.addArguments("--remot-alow-origin=*");
		WebDriver driver=new ChromeDriver(op);
	}

}
