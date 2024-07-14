package LC10;

import java.util.Scanner;

public class checkForCapital {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		System.out.println(CountUpper(s1));
		System.out.println(CountLower(s1));
		System.out.println(IsUpper(s1));
		System.out.println(IsLower(s1));

	}
	// ASCII value of Capital is 65-90
	public static int CountUpper(String string) {
		int count = 0;
		int N = string.length();
		for(int i=0; i<N; i++) {
			if(string.charAt(i)>=65 && string.charAt(i)<=90) {
				count++;
			}
		}
		return count;
	}
	
	//ASCII value of lower is 97-122
	public static int CountLower(String string) {
		int count = 0;
		int N = string.length();
		for(int i=0; i<N; i++) {
			if(string.charAt(i)>=97 && string.charAt(i)<=122) {
				count++;
			}
		}
		return count;
	}
	
	// To check if every character is Upper or not 
	public static boolean IsUpper(String string) {
		int count = 0;
		int N = string.length();
		for(int i=0; i<N; i++) {
			if(string.charAt(i)>=65 && string.charAt(i)<=90) {
				count++;
			}
		}
		if(count==N) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// To check if every character is lower or not 
	public static boolean IsLower(String string) {
		int count = 0;
		int N = string.length();
		for(int i=0; i<N; i++) {
			if(string.charAt(i)>=97 && string.charAt(i)<=122) {
				count++;
			}
		}
		if(count==N) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void printAscii() {
		char ch = 'A';
		int val =ch;
		System.out.println(val);
	}
}
