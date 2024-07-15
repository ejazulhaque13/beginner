package LC11;

import java.util.Scanner;

public class ReverseStringByWord {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string");
		String s1 = scanner.nextLine();
		System.out.println(reverse(s1));

	}
	
	public static String reverse(String string) {
		String[] arr = string.split(" ");
		int N = arr.length-1;
		
		String reversedString = "";
		
		for(int i =N ; i>=0; i--) {
			if(i==0) {
				reversedString = reversedString + arr[i];
			}
			else {
				reversedString = reversedString + arr[i] + " ";
				//reversedString = reversedString + " ";
			}			
		}
		
		return reversedString;
	}
	/*
	public static String reverseEveryWord(String string) {
		
		
	} */
}
