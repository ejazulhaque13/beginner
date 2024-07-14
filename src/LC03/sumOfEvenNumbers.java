package LC03;

import java.util.Scanner;

public class sumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int X = scanner.nextInt();
		int sum=0;
		for(int i=2; i<=N; i+=2) {
			sum=sum+i;
			if (sum>X) {
				break;
			}
		}
		System.out.println(sum);
	}
}
