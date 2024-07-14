package LC4;

import java.util.Scanner;

public class Pattern3 {
	/*	 If N =5
	    _ _ _ _ *
	    _ _ _ * *
	    _ _ * * *
	    _ * * * *
	    * * * * *
	    
	    */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1; i<=N; i++) {
			int space = N-i;
			for(int j=1; j<=space; j++) {
				System.out.print("_ ");
			}
			int star =i;
			for(int k=1; k<=i; k++) {
			System.out.print("* ");
			}
			System.out.println();
		}
	}


}
