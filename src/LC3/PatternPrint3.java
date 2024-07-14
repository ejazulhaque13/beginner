package LC3;

import java.util.Scanner;

public class PatternPrint3 {
/*	 If N =5
     *
     * *
     * * *
     * * * *
     * * * * *
     
     */ 
     
 public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	for(int i=0; i<N; i++) {
		//System.out.println("*");
		for(int j=0; j<=i; j++) {
			System.out.print("*" +" ");
		}
		System.out.println();
	}
}
}
