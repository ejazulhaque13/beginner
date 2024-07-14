package LC07;

import java.util.Scanner;

public class sumOfTwoElements {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}		
		
		System.out.println("Enter the value of k :");
		int k = scanner.nextInt();
		
		System.out.println(pair(arr, k));
	}
	
	public static boolean pair(int[] arr, int k) {
		int N = arr.length;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i!=j && arr[i]+arr[j]==k)
					return true;
			}
		}
		return false;
	}

}
