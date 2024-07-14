package LC07;

import java.security.PublicKey;
import java.util.Scanner;

public class frequency {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println("Enter the frequency of element need to be searched");
		int k = scanner.nextInt();
		System.out.println("The frequecy of element: " + k + " is " + freq(arr, k));
		
	}
	public static int freq(int[] arr, int k) {
		int N = arr.length;
		int count=0;
		for(int i=0; i<N; i++) {
			if(arr[i]==k) {
				count++;
			}
		}
		return count;
	}

}
