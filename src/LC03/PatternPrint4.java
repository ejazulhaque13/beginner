package LC03;

import java.util.Scanner;

public class PatternPrint4 {
	/* If N = 4 and M =5
	    * * * * *
	    * * * * *
	    * * * * *
	    * * * * *
	    * * * * *
	 
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
			System.out.print("*" + " ");
		}
		System.out.println();
		}
	}
}
