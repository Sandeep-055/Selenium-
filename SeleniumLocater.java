package sandeep1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocater {
	public static void main(String[] args) throws InterruptedException {
		
		//its about finding the link and button and radiobutton and checkbox things
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.id("firstName")).sendKeys(new CharSequence[] {"Sandeep"});
		Thread.sleep(3000);
		driver.findElement(By.id("lastName")).sendKeys(new CharSequence[] {"Yaragani"});
		Thread.sleep(3000);
		WebElement Button=driver.findElement(By.className("bcRadioButton"));
		Button.click();//check.
		Thread.sleep(3000);
		if(Button.isSelected())
			Button.click();//un check
		Thread.sleep(3000);
		Button.click();
		Thread.sleep(3000);//re check
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(3000);
		WebElement hindi= driver.findElement(By.id("hindichbx"));
		hindi.click();//check
		Thread.sleep(3000);
		if(hindi.isSelected())
			hindi.click();//un check
		driver.findElement(By.id("email")).sendKeys(new CharSequence[] {"sandeepyerragani@gmail.com"});
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(new CharSequence[] {"Sandeep123"});
		Thread.sleep(3000);
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		Thread.sleep(2000);
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
