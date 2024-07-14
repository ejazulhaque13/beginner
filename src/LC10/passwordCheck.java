package LC10;

import java.util.Scanner;

public class passwordCheck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		strength(s1);
	}
	
	public static void strength(String string) {
		int c = 0;
		c = c + checkLength(string);
		c = c + checkSingleUpper(string);
		c = c + checkSingleLower(string);
		c = c + checkNo(string);
		c = c + checkSpecialChar(string);
		
		if (c==5) {
			System.out.println("Strong");
		}
		else if (c==2) {
			System.out.println("Good");
		}
		else if (c==3) {
			System.out.println("Medium");
		}
		else if (c==2) {
			System.out.println("Week");
		}
		else if (c==1) {
			System.out.println("Very Week");
		}
	}
	
	public static int checkLength(String string) {
		if (string.length()>=8) {
			return 1;
		}
		return 0;
	}
	
	
	public static int checkSingleUpper(String string) {
		int N = string.length();
		for(int i=0; i<N; i++) {
			if(string.charAt(i)>=65 && string.charAt(i)<=90) {
				return 1;
			}
		}
		return 0;
	}

	
	public static int checkSingleLower(String string) {
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)>=97 && string.charAt(i)<=122) {
				return 1;
			}
		}
		return 0;
	}
	
	public static int checkSpecialChar(String string) {
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)>=32 && string.charAt(i)<=64) {
				return 1;
			}
		}
		return 0;
	}
	
	
	public static int checkNo(String string) {
		for(int i=0; i<string.length(); i++) {
			if(string.charAt(i)>=48 && string.charAt(i)<=57) {
				return 1;
			}
		}
		return 0;
	}
}
