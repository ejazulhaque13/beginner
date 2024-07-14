package LC04;

import java.util.Scanner;

public class Pattern2 {
	/*	 If N =5
	    * _ _ _ _ *
	    * _ _ _ *
	    * _ _  *
	    * _ *
	    * *
	    
	    */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1; i<=N+1; i++) {
			System.out.print("* ");
			int space = N-1;
			for(int j=i-1; j<=space; j++) {
				System.out.print("_ ");
			}
			System.out.println("*");
		}
	}

}
