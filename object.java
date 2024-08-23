package Java;

import java.util.Scanner;

public class object {
	public static void main(String[] args) {
		object s=new object();
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		int b=scan.nextInt();
		int e=a+b;
		int f=a-b;
		int c=a*b;
		System.out.println("multiplication of two numbers ="+c+ 
				            "add two numbers ="+e +
				            "sub two number ="+ f);
		
		
	}

}
