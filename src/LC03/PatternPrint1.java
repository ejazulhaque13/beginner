package LC03;

import java.util.Scanner;

public class PatternPrint1 {
	// * * * * *
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		for(int i=0; i<N; i++) {
			System.out.print("*" + " ");
		}
	}

}
