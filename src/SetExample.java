
/**
 * Reverse a string word by word 
 * Exp "Hey all" will be "yeH lla"
 * @author yakdere
 *
 */
public class SetExample {
	
  public static void wordReverser(String str) {
	String reversed = "";
	for (String words: str.split(" ")) {
		  reversed += reverse(words) + " ";
	}
	System.out.println (reversed);
  }
  
 
  private static String reverse(String string) {
	return (new StringBuilder(string)).reverse().toString();
}

  public static void main(String args[]) {
	  
    String mystring = "career goals";
    wordReverser(mystring);
  }
}
