package LC02;

import java.util.Scanner;

public class sumOfDigits {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum=0;
		while (N!=0) {
			sum=sum+N%10;
			N=N/10;
		}
		System.out.println("Sum of digits are: " + sum);
	}

}
