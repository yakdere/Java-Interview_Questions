
public class updateBits {
	int n, m, i, j;
	//my example n = 1100111101 m = 101 and i = 3 j is size of m
	public int updateBitsmethod1(int n, int m, int i, int j) {
		int a = n >> i; //shifted i times to left ..1100111 = a
		//0xFFFF means (F= 15 hexadecimal) 1111 1111 1111 1111
		//now we want to add m to last of n
		// before n + m (or) have to set m part to 0. a & 111110...0 sola kaydirinca shift sayisi kadar sifir ekleniyor
		a = ( a & (0xFFFFFFFF << (j-i)) | m); //..a = 1100101
		//now have to add last numbers of n
		a = ( a << i) & (~(1 << i) & n);// 1100101.000. a shifted i times 
		// n..1100111101 and 00000000111, this way only last i items stayed same and ready to add to a, therefore we used or
		
		return a;	
	}
	public int updateBitsmethod2(int n, int m, int i, int j) {
		int result = 0;
		for (int k=i; k < j; k++) {
			result = setBit(n, i, getBit(m, k-i));	
		}
		return result;
	}
	private int setBit(int n2, int bit, int i2) {
		return (~(1 << i2) & (bit << i2)) | n2;
	}
	private int getBit(int m2, int k) {
		int bit_i = (m2 >> k) & 1;
		return bit_i;
	}
	
	public static void main(String[] args) {
		updateBits mybits = new updateBits();
		int result = mybits.updateBitsmethod1(1100111101, 101, 3, 6);
		int result2 = mybits.updateBitsmethod2(1100111101, 101, 3, 6);
		System.out.println("converted result is:" +result);
		System.out.println("converted result is:" +result2);
			
	}

}
