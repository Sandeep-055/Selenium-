package sandeep1;

import java.util.Scanner;

public class employer_UsingArrays {
	public static void main(String[] args) {
		int numOfemployer;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of Employers :");
		 numOfemployer=scan.nextInt();
		
		String names[]= new String[numOfemployer];
		int age[]=new int[numOfemployer];
		double salarys[]=new double[numOfemployer];
		
		//input data for employers
		for(int i=0;i<numOfemployer;i++) {
			System.out.println("Name of Employers :"+(i+1)+":");
			names[i]=scan.next();
			System.out.println("Employer age :"+(i+1)+ ":");
			age[i]=scan.nextInt();
			System.out.println("Employer Salarie :"+(i+1)+ ":");
			salarys[i]=scan.nextDouble();
			
			
			//increment 10%
			
			salarys[i]+=salarys[i]*0.1;
			
			
			//employer information
			System.out.println("Employers Infromation :");
			for(int a=0;a<numOfemployer;a++) {
				System.out.println("Name of Employers :"+names[i]);
				System.out.println("Age of Employers :"+age[i]);
				System.out.println("Salary of Employers :"+salarys[i]);
				
				//check employee eligible for award or not
				if(age[i]>35) {
					System.out.println("Senior Employer Award: Yes");
					
				}else {
					System.out.println("Senior Employer Award: No");
				}
				System.out.println("--------------------------------");
				
			}
			

			
		}
		
	}

}
