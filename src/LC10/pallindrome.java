package LC10;

import java.util.Scanner;

public class pallindrome {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string for pallindrome check");
		String s1 = scanner.next();
		System.out.println(isPallindrome(s1));
	}

	public static boolean isPallindrome(String string) {
		int P1=0;
		int P2=string.length()-1;
		while(P1<P2) {
			if(string.charAt(P1)==string.charAt(P2)) {
				P1++;
				P2--;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
