package LC1;

import java.util.Scanner;

public class electricityBill {
	public static void main(String[] args) {
		int N;
		Scanner scanner = new  Scanner(System.in);
		N=scanner.nextInt();
		if (N<=100) { //[1-100]cost is 10
			System.out.println("Bill is "+ N*10);
		}else if (N<=200) { //[100-200] cost is 20 
			System.out.println("Bill is "+ (1000+((N-100)*20)));
		}else if (N<=300) { //[200-300] cost is 30
			System.out.println("Bill is :" + (3000+((N-200)*30)));
		}else if (N<=400) { //[300-400] cost is 30
			System.out.println("Bill is :" + (6000+((N-300)*40)));
	}else {
		System.out.println("Bill is :" + (10000+((N-400)*50)));
	}
	}
}
