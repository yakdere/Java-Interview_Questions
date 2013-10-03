/**
 * Implement a math calculater only using + and -
 * @author yakdere
 *
 */
public class MathUnit {
	public static int add(int a, int b) {
        return a+b;
    }
    public static int substract( int a, int b ) {
        return a-b;
    }
    public static int multiply( int a, int b ) {
        int result = 0;
        if (a == 0 || b == 0) { return result; }
        for (int i = 0; i < Math.abs(b); i++) { 
               result += a;
        }
        if ( b > 0) { return result;
        } else { return result = - result; }
        
    }
    public static int divide( int a, int b ) {
        if ( Math.abs(a) < Math.abs(b) ) { return 0; }
        int count = 1;
        int d = Math.abs(a)-Math.abs(b); 
        while (d >= Math.abs(b)) {
            d -= Math.abs(b);
            count++;
        }
        if ( a < 0 && b > 0 || b < 0 && a < 0) { return count = - count; }
        else { return count; }
    }
    
    public static int power(int num, int pow) {
        if ( pow < 0) { return 0; } //ignored decimal numbers
        else {
        	int result = 1;
        	for ( int i = 0; i < pow; i++) {
        		result = multiply(num, result);
        	}
        	return result;
        }
    }
    public static String divide( int num, int den, int places) {
    	num = multiply( num, power(10, places));
    	int result = divide( num, den);
    	String R = Integer.toString(result);
    	return R.substring(0, R.length()-places)+"."+R.substring(R.length()-places);
    }
    public static int powerRec( int num, int pow) {
        if ( pow == 0) { //base case
            return num;
        }
        return num + powerRec( num, pow -1);
    }
    public static void main(String args[]) {
    	System.out.println(+add(5,3));
    	System.out.println(+substract(5,3));
    	System.out.println(+substract(5, -3));
    	System.out.println(+multiply(10, 5));
    	System.out.println(+multiply(10,-5));
    	System.out.println(+multiply(-10,-5));
    	System.out.println(+divide(-2, -1));
    	System.out.println(+divide(-2, -3));
    	System.out.println(+divide(10,-5));
    	System.out.println(+divide(-10,-5));
    	System.out.println(+power(1, -5));
    	System.out.println(+power(2,3));
    	System.out.println(+power(-2 ,-3));
    	System.out.println(+power(-2, 4));
    	System.out.println(+powerRec(2,3));
    	System.out.println(divide(5,3,2));
    	
    }
}
