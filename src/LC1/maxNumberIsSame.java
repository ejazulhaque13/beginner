package LC1;

import java.util.Scanner;

public class maxNumberIsSame {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scanner = new  Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		if (a>=b && a>=c) {
			System.out.println("Max is : " + a);
		}else if (b>=a && b>=c) {
			System.out.println("Max is : " + b);
		}else if (c>=b && c>=a) {
			System.out.println("Max is : " + c);
	    }
	}
	
}
