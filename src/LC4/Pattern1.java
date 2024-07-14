package LC4;

import java.util.Scanner;

public class Pattern1 {
	/*	 If N =5
    * _ _ _ *
    * _ _ _ *
    * _ _ _ *
    * _ _ _ *
    * _ _ _ *
    
    */ 

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1; i<=N; i++) {
			System.out.print("* ");
			for(int j=1; j<=N-2; j++) {
				System.out.print("_" +" ");
			}
			System.out.println("*");
		}
	}
}
