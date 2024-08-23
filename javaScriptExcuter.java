package sandeep.Selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExcuter {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		/*In this JAVAScriptExcuter there are 6 types to find or get the element. 
		 * By taking facebook login page reference.
		 * 1)ID        -document.getElementById('email').
		 * 2)name      -document.getElementsByName("email")[0];//its shows number of elements we can take what we want.
		 * 3)class Name-document.getElementsByClassName("inputtext _55r1 _6luy")[0];//its shows number of elements we can take what we want.
		 * 4)TagName   -document.getElementsByTagName('input')[2];//here 'input' is TagName.
		 * 5)css Selector-document.querySelector('#email');//here #email is css selector.
		 * 6)xpath       -format
		 *               document.evalute(xpathExpretion,contextnode,nameSpaceResolver,resultType,result).singleNodeValue.
		 *               -document.evaluate("//input[@id='email']",document,null,XPathResult.FIRST_ORDERED_NODE_TYPE,null).singleNodeValue; */
		JavascriptExecutor jcExcuter= (JavascriptExecutor) driver;//casting
		WebElement element =(WebElement) jcExcuter.executeScript("return document.getElementById('email')");
		element.sendKeys(new CharSequence[] {"sandeep"});
		
		
	}

}
