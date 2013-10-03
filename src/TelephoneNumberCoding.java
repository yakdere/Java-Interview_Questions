/**
 * @author yakdere
  *Implement a function that takes a seven-digit telephone number and prints
  *out all of the possible “words” or combinations of letters that 
  *can represent the given number.
 */
public class TelephoneNumberCoding {

	final int telephone_number_lenght;
	char[] possibleword;
	final int[] telephone_number;

	public TelephoneNumberCoding(int[] n) {
		this.telephone_number_lenght = n.length;
		this.telephone_number = n;
		this.possibleword = null;
	}

	public void printWords() {
		printWords(0);
	}

	private void printWords(int curLoc) {
		//base case
		if (possibleword.length == telephone_number_lenght) { 
			System.out.println(new String(possibleword));
			return;
		}
		for (int j = 1; j < 4; j++) {
			possibleword[curLoc] = getCharKey(telephone_number[curLoc], j);
			printWords(curLoc+1);
			if (telephone_number[curLoc] == 0 || telephone_number[curLoc] == 1) {
				return; //Do nothing they will stay as 0 and 1 
			}
		}
	}
	private char getCharKey(int telephoneKey, int place) {
		if (telephoneKey == 2) {
			if (place == 1) return 'A' ; 
			if (place == 2) return 'B' ; 
			if (place == 3) return 'C' ;
		}
		else if (telephoneKey == 3) {
			if (place == 1) return 'D' ;
			if (place == 2) return 'E' ;
			if (place == 3) return 'F' ;
		}
		else if (telephoneKey == 4) {
			if (place == 1) return 'G' ;
			if (place == 2) return 'H' ;
			if (place == 3) return 'I' ;
		}
		else if (telephoneKey == 5) {
			if (place == 1) return 'J' ;
			if (place == 2) return 'K' ;
			if (place == 3) return 'L' ;
		}
		else if (telephoneKey == 6) {
			if (place == 1) return 'M' ;
			if (place == 2) return 'N' ;
			if (place == 3) return 'O' ;
		}
		else if (telephoneKey == 7) {
			if (place == 1) return 'P' ;
			if (place == 2) return 'R' ;
			if (place == 3) return 'S' ;
		}
		else if (telephoneKey == 8) {
			if (place == 1) return 'T' ;
			if (place == 2) return 'U' ;
			if (place == 3) return 'V' ;
		}
		else if (telephoneKey == 9) {
			if (place == 1) return 'W' ;
			if (place == 2) return 'X' ;
			if (place == 3) return 'Y' ;
		} 
		 //error case
		return '0';
}

	public static void main(String[] args) {
		int[] mynumber = new int[] {2,3,5,6,7,3,2,9};
		TelephoneNumberCoding codemynumber = new TelephoneNumberCoding(mynumber);
		codemynumber.printWords();
	}

}
