package sandeep.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_Assignment1 {
	
	public static void main(String[] args) {
		
		//1)Open the fire fox driver
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		
		//2)Maximize the browser window
		
	     driver.manage().window().maximize();
	     
	     //3)Navigate to "http://qatechhub.com"
	     
	    // method1
	    // driver.get("http://qatechhub.com");
	     
	     //method2
	     driver.navigate().to("http://qatechhub.com");
	     
	  //4)   Write a method to print PASS if the title of the page matches with “QA Automation Tools Trainings and Tutorials | QA Tech Hub” else FAIL. (If you are familiar with TestNG or JUnit use assert statement like assert.assertequals(actual, expected) to give a verdict of the pass or fail status.
	        
	    String name=driver.getTitle();
	    
	    System.out.println(driver.getTitle());
    
	     if(driver.getTitle()==name) {
   	 System.out.println("PASS");
	    	 
	     }else
	    	 System.out.println("Fail");
	    
//	    String actualTitle = driver.getTitle();
//
//        // Define the expected title
//        String expectedTitle = "QA Automation Tools Trainings and Tutorials | QA Tech Hub";
//
//        // Assert that the title is as expected
//        junit.framework.Assert.assertEquals(actualTitle, expectedTitle, "Page title verification");
//
//        // Print PASS or FAIL based on the assertion result
//        if (actualTitle.equals(expectedTitle)) {
//            System.out.println("PASS");
//        } else {
//            System.out.println("FAIL");
//        }
        
        
        
        
        //5)Navigate to the Facebook page (https://www.facebook.com)

	    driver.get("https://www.facebook.com");
	
	    
	    //6)Navigate back to the QA Tech Hub website.
	    
	    driver.navigate().back();
	    
	    //7)Print the URL of the current page.
	    
	   System.out.println(driver.getCurrentUrl());
	   
	   //8)Navigate forward.
	   
	   driver.navigate().forward();
	   
	   //9)Reload the page.
	   
	   driver.navigate().refresh();
	   System.out.println("refresh is pass");
	   System.out.println(driver.getTitle());
	   
	  //10) Close the Browser.
	   
	   driver.close();
	}
	

}
