package sandeep1;

public class reverseWord {
  public static void main(String[] args) {
	String word="sandeep";
	//to casting the by using stringbulider for reverse
	//converting string to stringBuilder
	StringBuilder reverse=new StringBuilder(word);
	//by using reverse() to reverse the word
	reverse.reverse();
	//convert the stringBuilder to string
	String reverseword=reverse.toString();
	System.out.println("original word :"+word);
	System.out.println("reversedword  :"+reverseword);
	
}      
}
