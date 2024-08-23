package sandeep1;

import java.util.Scanner;

public class ifAndelse2 {
 public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	String a=scan.next();
	
	
	if(a.equals("sandeep")) {
		System.out.println("is true");
		
	}else {
		System.out.println("its wrong");
	}
	String b="sandy";
	if(b.equals("Sandy")) {
		System.out.println("is true");
	}else {
		System.out.println("its wrong");
	}
}
}
