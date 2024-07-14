package LC5;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N = scanner.nextInt();
		int a =0, b=1;
		int c;
		System.out.print(a +" " +b+" ");
		for(int i=2; i<N; i++) {
			c=a+b;
			System.out.print(c +" ");
			a=b;
			b=c;
		}
		System.out.println(isFibonacci(N));
	}
	
	// To check if any no is Fibonacci or not
	public static boolean isFibonacci(int N) {
		int a=0 , b=1 ,c;
        int count=0;
        for(int i=0; i<=N; i++) {
            c=a+b;
            if(c==N || N==0) {
            count++;
            break;
            }
            if(a>N)
            break;
            a=b;
            b=c;
        }
        if(count!=0)
        return true;
        else
        return false;
        
	}
}
