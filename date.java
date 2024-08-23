package sandeep1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date {
	public static void main(String[] args) throws ParseException {
		String dateFormate="31/FEB/2023";
		SimpleDateFormat targetdateformate=new SimpleDateFormat("dd/MMM/yyyy");
		targetdateformate.setLenient(true);
		//targetdateformate.setLenient(false)	;
		Date formatedTargetDate=(Date)targetdateformate.parse(dateFormate);
		System.out.println(formatedTargetDate);
	} 

}
