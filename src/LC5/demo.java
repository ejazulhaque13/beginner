package LC5;

import java.security.PublicKey;
import java.util.Scanner;

import LC3.sumOfEvenNumbers;

public class demo {
	public static void main(String[] args) {
		//given to 2 nos calculate sum

		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int number = scanner.nextInt();
		int z = sum(A,B);
		System.out.println(z);
		printEvenNos(number);
		if (isPrime(number)) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
		
	}
	public static int sum(int a, int b) {
		return a+b;
	}
	static  void printEvenNos(int N) {
		// TODO Auto-generated method stub
		for(int i =2; i<N; i+=2) {
			System.out.print(i+" ");
		}
	}
	static boolean isPrime(int N) {
		int count =0;
		for(int i=1; i<=N; i++) {
			if(N%i==0)
				count++;
		}
		if (count==2) {
			return true;
		}
		else {
			return false;
		}
	}

}
