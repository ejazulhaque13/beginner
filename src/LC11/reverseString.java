package LC11;

import java.util.Scanner;

import LC10.checkForCapital;

public class reverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter your string");
		String s1 = scanner.next();
		System.out.println(reverse(s1));
	}
	
	public static String reverse(String string) {
		char[] ch = string.toCharArray();
		int P1=0;
		int P2=string.length()-1;
		while(P1<P2) {
			char temp = ch[P1];
			ch[P1] = ch[P2];
			ch[P2] = temp;
			
			P1++;
			P2--;
			
		}	
		string = string.valueOf(ch);
		return string;
	}
	
	//Another way  which is much simpler
	
    public static String reverse2(String string) {
        String reversed = "";
        int N = string.length() - 1;
        for (int i = N; i >= 0; i--) {
            reversed = reversed + string.charAt(i);
        }
        return reversed;
    }

}
