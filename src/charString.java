
public class charString {
	String str;
	/**
	 * @param args
	 */
	charString() {
		str = new String();	
	}
	//remove dublicate elements on the string and return it
	static String dupremover(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					str = str.substring(0, j) + str.substring(j+1);
				}
			}
		}
		return str;
	}
	//reverse a string using recursion algorithm
	public String reverse(String s) {
		if( s.length() <= 1 || s == null) {
			return s;
		}
		return reverse(s.substring(1)) + s.charAt(0);
	}
	//this code write the all number values of characters from A to Z. 
	public static void main(String[] args) {
		charString sclass = new charString();
		
		for (int i = 'A'; i <= 'Z'; i++) { 
			char c = (char) i; 
			System.out.println(c + " " + i);
		}
		
		
		String mystring = "ancasdes";
		
		System.out.println("Mystring is :"+mystring);
		System.out.println("corrected format: " +dupremover(mystring));
		System.out.println("reversed string:" +sclass.reverse(mystring));
	
	}

}
 