package LC3;

import java.util.Scanner;

public class PatternPrint5 {
	/*	 If N =5
    * * * * *
    * * * *
    * * *
    * *
    *
    
    */ 
    
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	for(int i=N; i>=1; i--) {
		//System.out.println("*");
		for(int j=1; j<=i; j++) {
			System.out.print("*" +" ");
		}
		System.out.println();
	}
}

}
