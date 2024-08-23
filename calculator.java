package sandeep1;

import java.util.Scanner;

public class calculator {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Wellcome to sandy calucation");
		System.out.println("-----------------");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
	    System.out.println("1.addit1on :");
	    System.out.println("2.subtraction :");
	    System.out.println("3.multiplication :");
	    System.out.println("4.division :");
	    System.out.println("5.percentage :");
	    System.out.println("6.module :");
	    System.out.println("7.Select your option");
	    int choice=scan.nextInt();
	    double result = 0;
		switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);

        scan.close();
    }
}


