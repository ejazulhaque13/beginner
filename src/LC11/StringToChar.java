package LC11;

import java.util.Scanner;

public class StringToChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string");
		String s1 = scanner.next();
		// Use this function to do that
		char[] ch = s1.toCharArray();
		int L = ch.length;
		
		for(int i=0; i<L; i++) {
			System.out.print(ch[i]);
		}
	}
}
