package LC3;

import java.util.Scanner;
//Given N, calculate the sum of Natural numbers, but break if sum > 10
public class sumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int sum = 0;
		for(int i=0; i<=N; i++) {
			sum=sum+i;
			if(sum>10)
				break;
		}
		System.out.println(sum);
	}
}
