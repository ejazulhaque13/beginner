package LC7;

import java.util.Scanner;

public class increasingOrder {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println(increasing(arr));
		
	}
	// Code 1
	public static boolean increasing(int[] arr) {
		int N = arr.length;
		for(int i=0; i<N-1; i++) {
			if(arr[i]<arr[i+1]) {
				
			}
				else {
					return false;
				}
				
		}
		return true;
	}
	// Code 2
	public static boolean increasing2(int[] arr) {
		int N = arr.length;
		for(int i=0; i<N-1; i++) {
			if(arr[i]>=arr[i+1]) {
				return false;
			}			
		}
		return true;
	}
}
