package sandeep.Selenium;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class new1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		String targetDate="15/feb/2019";
		//String targetDate="15/feb/2024";
		Calendar calendar=Calendar.getInstance();
		try {
			
			SimpleDateFormat formatetargetDate=new SimpleDateFormat("dd/MMM/yyyy");
			formatetargetDate.setLenient(false);
			Date targetDateformated=formatetargetDate.parse(targetDate);
			calendar.setTime(targetDateformated);	
}           catch (ParseException e) {
			throw new Exception("invalid date");
}	
			int targetmonth=calendar.get(Calendar.MONTH);
			int targetYear=calendar.get(Calendar.YEAR);
			int targetDay=calendar.get(Calendar.DAY_OF_MONTH);
			
			driver.findElement(By.id("first_date_picker")).click();
			//August 2023
			String currentDate=driver.findElement(By.className("ui-datepicker-title")).getText();
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));	
			int curretmonth=calendar.get(calendar.MONTH);
			int currentYear=calendar.get(Calendar.YEAR);
			//for backward condition
			while(curretmonth > targetmonth ||currentYear > targetYear){
		    	//for backward condition
				driver.findElement(By.className("ui-datepicker-prev")).click();
				
				
				//for forward condition
				//while(curretmonth < targetmonth ||currentYear < targetYear){
				
				//for forward condition
				//driver.findElement(By.className("ui-datepicker-next")).click();
				currentDate = driver.findElement(By.className("ui-datepicker-title")).getText();
				calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(currentDate));	
			    curretmonth=calendar.get(calendar.MONTH);
				currentYear=calendar.get(Calendar.YEAR);
			}
			if(curretmonth== targetmonth &&currentYear==targetYear)
			driver.findElement(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//a[text()="+targetDay+"]")).click();
			else
				throw new Exception("invalid date");
		} 
}

/*If USER give the data format in string type we can proved simple date format like ("dd/MMM/yyyy").
 * by using setLenient method we can check date is valid or invalid its written boolean type. 
 * we must import date in java.util pack
 * parse is convert given date into computer readable way.
 * if we can use calendar method use calendar method in java.utill 
 * */
 