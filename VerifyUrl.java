package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.Assert;

public class VerifyUrl {
public static void main(String[] args) throws InterruptedException {
	String expectedTitle="Your store. Login";
	//System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://admin-demo.nopcommerce.com/login");
	
	String actualTitle=driver.getTitle();
	System.out.println("Actual Title : "+actualTitle);
	//Assert.assertEquals(actualTitle, expectedTitle);
	
	//Writing locator
	By adminLabelL=By.xpath("//*[@class='page login-page']//child::*[@class='page-title']//h1");
	//Identifying WebElement
	  WebElement   adminLabel=driver.findElement(adminLabelL);
	 //Getting label Which is displayed on UI
	  String actualLabelData=adminLabel.getText();
	  System.out.println(actualLabelData);
//Assert.assertEquals(actualLabelData, "Admin area demo","Test script Failed as label Data Does not Match with Expected Label Data");
	
By loginTitleL=By.xpath("//strong[text()='Welcome, please sign in!']");
WebElement loginTitle=driver.findElement(loginTitleL);
boolean status=loginTitle.isDisplayed();
//Assert.assertTrue(status,"Login title is not Displayed");
Thread.sleep(3000);
driver.close();
	
}
}
