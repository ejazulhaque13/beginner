package LC3;

import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;

public class noOfFactors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int count=0;
		for(int i=1; i<=N; i++) {
			if(N%i==0)
				count++;
		}
		System.out.println("No of factors are :" + count);
	}

}
