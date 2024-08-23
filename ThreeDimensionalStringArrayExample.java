package sandeep1;

public class ThreeDimensionalStringArrayExample {

	    public static void main(String[] args) {
	        // Declaration and initialization of a 3D array of strings
	        String[][][] threeDArray = {
	            { {"aaa", "aab"}, {"aba", "abb"} },      // Layer 0
	            { {"baa", "bab"}, {"bba", "bbb"} },      // Layer 1
	            { {"caa", "cab"}, {"cba", "cbb"} }       // Layer 2
	        };

	        // Printing all elements in the 3D array
	        for (int layer = 0; layer < threeDArray.length; layer++) {
	            System.out.println("Layer " + layer + ":");
	            System.out.print("{ ");
	            for (int row = 0; row < threeDArray[layer].length; row++) {
	                System.out.print("{ ");
	                for (int col = 0; col < threeDArray[layer][row].length; col++) {
	                    System.out.print(threeDArray[layer][row][col]);
	                    if (col < threeDArray[layer][row].length - 1) {
	                        System.out.print(", ");
	                    }
	                }
	                System.out.print(" }");
	                if (row < threeDArray[layer].length - 1) {
	                    System.out.println(",");
	                }
	            }
	            System.out.println(" }");
	            if (layer < threeDArray.length - 1) {
	                System.out.println();
	            }
	        }
	    }
	
}
