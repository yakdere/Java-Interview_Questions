/**
 *Find all permutations of given string using recursive algorithm
 *@author yakdere
 */
import java.util.ArrayList;


public class PermutationOfString {

	public void findallpermut(String str) {
		if (str == null) return; //error check
		String perm = " "; //we have to divide the string pieces. Initiliaze it as a empty string
		findallpermut (str, perm); 
	}

	private void findallpermut(String str2, String perm) {
		int n = str2.length(); // length of string
		if ( n == 0) { // base case of recursion
			System.out.println(perm);
		} else {
			for ( int i = 0; i < n; i++) {
				//divide the perm piece from string and it will be new string
				//perm will locate between every string characters
				findallpermut(str2.substring(0, i) + str2.substring(i+1, n), perm + str2.charAt(i));
			}
		}

	}
	public void findallcombination(String str1) {
		if (str1 == null) return;
		else {
			ArrayList<String> holder = new ArrayList<String>();
			String prefix = " ";
			findallcombination(str1, prefix, holder);
		}	
	}


	private void findallcombination(String str1, String prefix,
			ArrayList<String> holder) {
		int n = str1.length();
		if (n == 0) { // base case
			for (int j = 0; j < holder.size(); j++) {
				System.out.println("All combinations of the given String: "+holder.get(j));
			}
		}
		for (int i = 0; i < n; i++) {
			holder.add(prefix);
			findallcombination(str1.substring(i+1, n), prefix + str1.charAt(i), holder);
		}


	}

	public static void main(String[] args) {
		PermutationOfString test = new PermutationOfString();
		String myname = "yaprak" ;
		test.findallpermut(myname);
		test.findallcombination(myname);
	}
}