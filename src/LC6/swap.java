package LC6;

import java.util.Scanner;

import javax.naming.InitialContext;

public class swap {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println(a + " " + b);
		swap(a, b);
	}
	public static void swap(int a, int b) {
		int temp = a;
		a=b;
		b=temp;
		System.out.println(a + " " + b);
		
	}
}
