package sandeep1;

import java.util.Scanner;

public class prac1 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("wellcome to my room");
		hal();
		
	}
public static void hal() {
	//type here what are in hall
	System.out.println("frist room is hall:Things in hall=");
	System.out.println("One Tub_Light");
	System.out.println("one Led_Light");
	System.out.println("one fan");
	String fan="one fan";
	String light="one light";
	if(fan==light) {
		System.out.println("fan is here");
		
	}else 
		System.out.println("fan is not in hall");
	
}
public static void bed_room() {
	System.out.println("second room is bed_room:Things in bedroom=");
	System.out.println("One Tub_Light");
	System.out.println("one Led_Light");
	System.out.println("one fan");
	
	
}
}