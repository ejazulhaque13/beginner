package LC10;

import java.util.Scanner;

public class demo2 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		oddChar(s1);
		System.out.println(countOcc(s1, 'e'));
		
	}

	public static int countOcc(String string, char a) {
		int N = string.length();
		int count=0;
		for(int i=0; i<N; i++) {
			if(a==string.charAt(i)) {
				count++;
			}
		}
		return count;
	}
	public static void oddChar(String string) {
		int N = string.length();
		for(int i=1; i<N; i+=2) {
			System.out.println(string.charAt(i));
		}
	}
	
	public static void print(String string) {
		System.out.println(string);
	}
}
