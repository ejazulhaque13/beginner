package LC10;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = "abc";
		String s2 = "movie";
		
		System.out.println(s1 + s2 +" "+ s1.length());
		
		String s3;
		String s4;
		
		// taking input in string
		s3 = scanner.next();
		System.out.println(s3.charAt(0));
		
		s4 = scanner.next();
		
		int N = s4.length();
		for(int i=0; i<N; i++) {
			System.out.print(s4.charAt(i));
		}
		
		// to read an entire line
		String s5 = scanner.nextLine();
		System.out.println(s5);
	}
}
