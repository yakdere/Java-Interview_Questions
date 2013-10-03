/**
 * Given two string decide second one is the first's rotated version or not
 * @author yakdere
 *
 */

public class Substringfinder {

	String string1;
	String string2;
	
	Substringfinder() {
		string1 = new String();
		string2 = new String();	
	}
	
	public static boolean AreRotations(String string1, String string2) {
		if (string1 == string2) return true;
		
		int len = string1.length();
		if (len != string2.length())
			return false;
		
		String string3 = string1 + string1;
		
		// return string3.indexOf(string2) != -1;
		for (int i = 0; i < len; i++) {
			if (string3.charAt(i) == string2.charAt(0)) {
				int k = i;
				if(string2.compareTo(string3.substring(k, k + len)) == 0) {
					return true;
				}	
			}
		}

		return false;
	}
	
	
	public static void main(String[] args) {
		String str1 = "waterbottle";
		String str2 = "erbottlewat";
		
		
		boolean answer = AreRotations(str1, str2);
		System.out.println(answer);
		
	}
}
