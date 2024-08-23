package sandeep1;

public class EmployerProject {
	
	    public static void main(String[] args) {
	        String names[] = {"Sandeep", "Viany", "Sai"};
	        int age[] = {25, 35, 39};
	        double salarys[] = {30000, 45000, 56000};

	        // Increment salary by 10%
	        for (int i = 0; i < salarys.length; i++) {
	            salarys[i] += salarys[i] * 0.1;
	        }

	        System.out.println("\nEmployer Information:");
	        for (int i = 0; i < names.length; i++) {
	            System.out.println("Name: " + names[i]);
	            System.out.println("Age: " + age[i]);
	            System.out.println("Salary: " + salarys[i]);

	            // Check for senior employer award
	            if (age[i] < 35) {
	                System.out.println("Senior Employer Award: Yes");
	            } else {
	                System.out.println("Senior Employer Award: No");
	            }

	            System.out.println("-----------------------");
	        }
	    }
	}



