package LC02;

import java.util.Scanner;

public class numberOfDigits {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N =  scanner.nextInt();
		int digit =0;
		if (N==0) {
			System.out.println("No.of digit is: 1");
		} else {
			while (N!=0) {
				N=N/10;
				digit++;
			}
}

		System.out.println("No. of digits are: " + digit);
	}

}
