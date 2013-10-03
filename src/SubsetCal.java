/**
 * Return all subsets of given integer array
 * @author yakdere
 */
import java.util.Vector;


public class SubsetCal {
	

	//public subsets method will be called by user. User doesnt need to add any empty subset or a pointer number
	public static Vector<Vector<Integer>> AllSubsetsN(Vector<Integer> S, int n) {
		// subsets start with empty set.
		Vector<Vector<Integer>> subsets = new Vector<Vector<Integer>>();		
		subsets.add(new Vector<Integer>());
		
		AllSubsetsN(S , n, 0 , subsets); //calls the private method with pointer and empty subset
		return subsets;
	}
	
	//this method should return subsets
	private static void AllSubsetsN(Vector<Integer> s, int n, int p, Vector<Vector<Integer>> subsets) {
		if (p == s.size()) {  // after all subsets produced in subsets, we need to return only size of n subsets
			for (int j = subsets.size() - 1; j >= 0;  j--) {  //or  j < subsets.size
				if (subsets.elementAt(j).size() != n) subsets.remove(j);
			}
			return;	
		}

		final int curr_elem = s.elementAt(p); // p start from zero, recursively get the next element in the main set. a>>b>>c
		final int size = subsets.size();
		for (int i = 0; i < size; i++){
			// use vectors copy constructor to create a copy of subsets[i] into s_i
			Vector<Integer> s_i = new Vector<Integer>(subsets.elementAt(i));  //vector s_i is is one subset.
			s_i.add(curr_elem);
			subsets.add(s_i);
		}
		// Ex. s= a,b,c 
		//first iteration size= 1 si = empty
		//second iteration p=1, so curr elem= a, size=1 si = empty, a
		//third iteration p=2 , curr elem= b, size= 2, si = b, ab
		//fourth iteration p=3, curr elem= c, size= 3, si= c, bc, abc

		AllSubsetsN(s , n, p + 1 ,subsets);
	}

	public static void main(String[] args) {
		int [] elements = {1, 10, 20, 50, 75, 100};
		Vector<Integer> S = new Vector<Integer>();
		for (int a : elements) S.add(a);
		
		Vector<Vector<Integer>> subsets = AllSubsetsN(S, 2);
		
		for (final Vector<Integer> subset : subsets) {
			String out = "{";
			for (int a : subset) out = out + a + ", ";
			out = out + "}";
			
			System.out.println(out);
		}
		
	}
	
}
