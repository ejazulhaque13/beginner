package LC4;

import java.util.Scanner;

public class Pattern4 {
	/*	 If N =5
    * * * * *
    _ * * * *
    _ _ * * *
    _ _ _ * *
    _ _ _ _ *
    
    */
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt();
	for(int i=1; i<=N; i++) {
		int star = N-i;
		for(int j=1; j<=star; j++) {
			System.out.print("* ");
		}
		int space =i;
		for(int k=1; k<=i; k++) {
		System.out.print("_ ");
		}
		System.out.println();
	}
}

}
