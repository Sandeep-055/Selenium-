package Java;

//import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner =new Scanner(System.in);
	        int[] numbers = {5, 10, 3, 7, 2, 9};

	        int max = numbers[0]; // Assume the first element is the minimum

	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] >max) {
               max = numbers[i];
	            }
	        }

	        System.out.println("The least number is: " + max);
	    }

	}


