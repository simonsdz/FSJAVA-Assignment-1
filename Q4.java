package Assignment1;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 8;
		printPattern4(n);
	}
	static void printPattern4(int n) {
		int k = (n*2)-2;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < k; j++) {
				if(j == 0 || (j == (n*2)-1) || (i== (n-1)) || i >= j || (i+j >= k-1)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
