package Java;

import java.util.Scanner;

public class leastNumber {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
	  	        int[] numbers = {5, 10, 3, 7, 2, 9};

        	        int min = numbers[0]; // Assume the first element is the minimum

        	        for (int i = 1; i < numbers.length; i++) {
        	            if (numbers[i] < min) {
        	                min = numbers[i];
        	            }
        	        }

        	        System.out.println("The least number is: " + min);
        	    }
        	}

            
       

