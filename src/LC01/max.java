package LC01;

import java.util.Scanner;

public class max {
	public static void main(String[] args) {
		int a ,b,c;
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b=scanner.nextInt();
	    c =scanner.nextInt();
		if (a>b && a>c) {
			System.out.println("max no is: " + a );
		}else if (b>c) {
			System.out.println("max no is: " + b);
		} else {
			System.out.println("max no is :" + c);
		}
	}

}
