/**
 * Check if two given string is first's substring
 * @author yakdere
 *
 */
public class compstring {
	
	public static boolean HasSubstring(String str, String substr) {
		for (int i = 0; i <= str.length() - substr.length(); i++) {
			boolean equal = true;
			for (int j = 0; j < substr.length(); j++) {
				if (str.charAt(i+j) != substr.charAt(j)) {
					equal = false;
					break;
				}
			}
			if(equal == true)
				return true;
		}
		return false;
	}

	
	public static void main(String[] arguments){
		String str = "bababab";
		String substr = "abab";
		System.out.println(str + " has substring " + substr + " " + HasSubstring(str, substr));		
	}

}


