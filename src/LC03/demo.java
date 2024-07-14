package LC03;

import java.util.Iterator;
import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N  = scanner.nextInt();
		int count=0;
		//printing no. from 1-10
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		//checking if it is prime or not
		for(int i=1; i<=N; i++) {
			if(N%i==0)
				count++;
			if(count>2) // breaking when count is increasing to 2
				break;
		}
		if(count==2) {
			System.out.println("prime");
		}
		else {
			System.out.println("Not prime");
		}
	}

}
