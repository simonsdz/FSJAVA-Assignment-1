package Assignment1;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		printI(n);
		printN(n);
		printE(n);
		printU(n);
		printR(n);
		printO(n);
		printN(n);
	}
	
	
	static void printI(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || (i == (n-1)) || (j == (n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printN(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == 0) {
					System.out.print("*");
				} 
				if(j == (n - 1)) {
					System.out.print("*");
				}
				if(i > 0 && i < (n-1) && i==j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printE(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == 0 || j == 0 || (i == (n-1)) || (i == (n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((j == 0 && (i < (n-1))) || (j == (n-1) && (i < (n-1))) || (j > 0 && (j < (n-1) && (i==(n-1))))) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printR(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == 0 || (i==0 && j < (n-1)/2) || ((i==(n-1)/2 && j > 0 && j < (n-1)/2)) || (j == (n-1)/2 && i > 0 && (i < (n-1)/2)) ||
						(i-j == (n-1)/2)) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	static void printO(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if((i > 0 && (i < (n-1)) && j == 0) || (j > 0 && (j < (n-1)) && i==0) ||
						(i > 0 && (i < (n-1)) && j == (n-1)) || (j > 0 && (j < (n-1)) && i==(n-1))) {
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
