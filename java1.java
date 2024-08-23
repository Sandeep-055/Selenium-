package sandeep1;

import java.util.Scanner;

public class java1 {
    private static 	int a=10;
	private static int b=12;
    private static int c=15;
    private static int d=20;

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sandy=new Scanner(System.in);	
		System.out.println("WellCome to over Tea shop");
		System.out.println("Which Item you Want");
	    System.out.println("1.Dum chai :"+ a);
	    System.out.println("2.milk:"+ b); 
	    System.out.println("3.Genger cahi :"+ c);
	    System.out.println("4.boost :"+d);
	    System.out.println("Select Your Option");
	    int option=sandy.nextInt();
	    double total=0.0;
	    switch (option) {
		case 1:total=a;
		break;
		case 2:total=b;
		break;
		case 3:total=c;
		break;
		case 4:total=d;
		break;
		default:
		case 5:System.out.println("Invalid Option");
	    return;
		}
	    System.out.println("how many cups do you want:");
	    double noOfcups=sandy.nextInt();
	    total*=noOfcups;
	    System.out.println("Total Price ="+total);
	    System.out.println("Thanks for buying Tea");
	    sandy.close();
		
	}
    	
    }

