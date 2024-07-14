package LC02;

import java.util.Scanner;

public class reverseOfNumber {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N = scanner.nextInt();
		int x = N;
		int digit=0;
		int rev = 0;
		//Calculating the reverse of the digit
		while (N!=0) {
			digit = N%10;
			rev=rev*10+digit;
			N=N/10;
		}
		System.out.println("The reverse of the number is: " + rev);
		//To check if it is a palindrome or not 
		if (x==rev)
			System.out.println("it is a palindrome");
		 else 
			System.out.println("it is not a palindrome");
		
	}

}
