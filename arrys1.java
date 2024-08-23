package sandeep1;

import java.util.Arrays;
import java.util.Scanner;

public class arrys1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
////This lines stand for{0,1,2,3,4,5}
//		//number type data
//		int sandy[]= {2,4,5,6,7,8};
//		System.out.println(sandy[4]);
//		//2nd type number type data
//		int []numbers= {12,13,17,4,1,6};
//		int twonumber=numbers[2];
//		System.out.println(twonumber);
//		System.out.println(numbers[3]);
//		//String type data
//		String []names= {"sandeep","viany","sai","pavan"};
//		System.out.println(names[0]);
//		//finding the length
//		int length=sandy.length;
//		System.out.println(length);
//		//replacing the numbers
//		sandy[2]=3;
//		//to print total array
//		System.out.println(Arrays.toString(sandy));
//		//this method print array in same line
//		for(int i=0;i<sandy.length;i++) {
//			System.out.println(sandy[i] +" ");
//			
//		}
		
	//deferente  types of arrays
		int array[][]= {{1,2,3},
				        {12,13,14},
				        {5,6,78}};
		for(int a=0;a<array.length;a++) {
			System.out.println("a"+ a+ ":");
			System.out.println("{");
			for(int b=0;b<array[a].length;b++) {
				System.out.println("{");
				System.out.println(array[a][b]+"  ");
				if(b<array[a].length -1) {
					System.out.println(", ");
				}
			}
			System.out.println("}");
		if(a<array.length -1) {
			System.out.println(", ");
		}
		}
	    System.out.println("}");
		}
//		System.out.println(array[0][2]);
//		System.out.println(array[1][2]);
//		
//		//3-dimensional array
//		String vinay[][][]= {{{"sany","sandy"},{"nani","chinni"}},
//		                     {{"sany","sndy"},{"nan","chini"}},
//		                     {{"andy","sany"},{"nai","chinn"}}};
//		
//		for (int layer = 0; layer < vinay.length; layer++) {
//            for (int row = 0; row < vinay[layer].length; row++) {
//                for (int col = 0; col < vinay[layer][row].length; col++) {
//                    System.out.print(vinay[layer][row][col] + " ");
//                }
//                System.out.println(); // Move to the next line after each row is printed
//            }
//            System.out.println(); // Move to the next layer after each layer is printed
//        }
//		

	}

