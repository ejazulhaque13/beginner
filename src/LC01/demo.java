package LC01;

import java.util.Scanner;

public class demo {
	public static void main(String[] args) {
		System.out.println("Hello World");
		Scanner scanner = new Scanner(System.in);
		int n;
		n = scanner.nextInt();
		if (n%3==0 && n%5==0) {
			System.out.println("Shahrukh");
		}
		else if (n%3==0) {
			System.out.println("Selmon");
		}
		else if (n%5==0) {
			System.out.println("Akshay");
		}
		
	}

}
