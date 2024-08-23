package sandeep.Selenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class xpath {
/*XPath (XML Pathlanguage) is a query language for selecting nodes from an XML document or for finding elements in HTML web page.
 * Its defined by World Wide Web consortium(W3C)
 * ctrl+f is a key to open the XPath writer */
	private  static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 //chapter1();
		 chapter6();
		 Thread.sleep(3000);
		 driver.quit();
		 
		}
		public static void highligh(WebDriver driver, WebElement element){
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", element);
	}
		//xpath types chapter1 and chapter2
		public static void chapter1() {
		driver.get("https://www.w3schools.com/");
		//Absolute XPath-we never use this XPath in real time,Its always start with single '/'.
	    highligh(driver,driver.findElement(By.xpath("/html/body/div[1]/a[3]")));
		}
	     public static void chapter2() {
		/*Relative XPath -this can be used in real time project.
	    * Its Most Important thing we can use this in every time,Its always start with '//'.
	    * syntax //tagName[@attribute='value']
	    * */
	    driver.get("https://www.w3schools.com/");
		highligh(driver, driver.findElement(By.xpath("//a[@title=\"Exercises and Quizzes\"]")));
		}	
	     
	    //xpath attribute
		public static void chapter3() {
			driver.get("https://www.w3schools.com/");
			//driver.findElement(By.xpath("//a[@id=\"w3loginbtn\"]")).click();
			driver.findElement(By.xpath("//a[@title=\"Search W3Schools\"]")).click();
			
		}	
		//operations xpath
			
		public static void chapter4() {
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			/*there are 6types of operation xpaths are there 
			1.=, 2.!=  ,3.<  ,4.=<  ,5.>  ,6.>=  */
			driver.findElement(By.xpath("//input[@maxlength=10]")).sendKeys(new CharSequence[] {"sandeep"});
			driver.findElement(By.xpath("//input[@maxlength!=10]")).sendKeys(new CharSequence[] {"yaragani"});
			highligh(driver,driver.findElement(By.xpath("//input[@maxlength>10]")));
			highligh(driver,driver.findElement(By.xpath("//input[@maxlength<15]")));
			driver.findElement(By.xpath("//input[@maxlength!=10]")).clear();
			driver.findElement(By.xpath("//input[@maxlength>=15]")).sendKeys(new CharSequence[] {"vinay"});
			driver.findElement(By.xpath("//input[@maxlength=10]")).clear();
			driver.findElement(By.xpath("//input[@maxlength<=10]")).sendKeys(new CharSequence[] {"sai"});
		
		}
		//xpath conditions and ,or, not
		public static  void chapter5(){
			//and
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
		    List<WebElement>element=driver.findElements(By.xpath("//input[@maxlength=10 and @name ='na' and @type='tt']"));
			System.out.println(element.size());//"0" elements
		    List<WebElement>elements=driver.findElements(By.xpath("//input[@maxlength>=10 and @name ='name' and @type='text']"));
			System.out.println(elements.size());//"2" elements
			
			//or
			List<WebElement>elements1=driver.findElements(By.xpath("//input[@maxlength =10 or @name='name' or @type='text']"));
			System.out.println(elements1.size());//"5" elements
			List<WebElement>elements2=driver.findElements(By.xpath("//input[@maxlength =10 or @name='ne' or @type='tx']"));
			System.out.println(elements2.size());//"1" elements
			
			//not
			List<WebElement>elements3=driver.findElements(By.xpath("//input[not(@maxlength =10)]"));
			System.out.println(elements3.size());//"14" elements
			
			
		}
		public static void chapter6() {
			driver.get("https://www.hyrtutorials.com/p/add-padding-to-containers.html");
			highligh(driver, driver.findElement(By.xpath("//table[@id=\"contactList\"]/tbody/tr[6]")));
			driver.findElement(By.linkText("Click")).click();	
		}
		}
	
	

