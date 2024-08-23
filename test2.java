package selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {
	public static void main(String[] args) {
		String expectedTitle="Your store. Login";
		//System.setProperty("webdriver.chrome.driver","E:\\jarfiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//numberof locatores 
		
		WebElement element=driver.findElement(By.className("gLFyf"));
		WebElement element1=driver.findElement(By.name("gLFyf"));
		WebElement element2=driver.findElement(By.xpath("gLFyf"));
		WebElement element3=driver.findElement(By.id("gLFyf"));
		WebElement element4=driver.findElement(By.linkText("gLFyf"));
		WebElement element5=driver.findElement(By.cssSelector("gLFyf"));
		WebElement element6=driver.findElement(By.partialLinkText("gLFyf"));
		WebElement element7=driver.findElement(By.tagName("gLFyf"));
		
		
		
		if(element.isEnabled())
			if(element.isDisplayed()) {
				element.sendKeys("www.ibomma.com");
				
					System.out.println("is good to go");
					
					
			}else
					System.out.println("is notgood to go");
					
					
		
		

		
	} 

}
