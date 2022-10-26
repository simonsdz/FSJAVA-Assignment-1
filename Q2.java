package Assignment1;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		print(n);
	}

	static void print(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
