package LC3;

import java.util.Scanner;

public class PatternPrint6 {
	/*	 If N =5
    *
    * 2
    * 2 *
    * 2 * 4
    * 2 * 4 *
    
    */ 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=1; i<=N; i++) {
			for(int j=1; j<=i; j++) {
				if (j%2==0) {
					System.out.print(j +" ");
				}else {
				System.out.print("*" + " ");
			}		
			}
			System.out.println();
		}
		
	}

}
