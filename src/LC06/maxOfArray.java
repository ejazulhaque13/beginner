package LC06;

import java.util.Scanner;

public class maxOfArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Max in the array is : " + max(arr));
		
	}
	// Edge case this func will only work for +ve numbers
	public static int max(int[] arr) {
		int max = 0;
		int N = arr.length;
		for(int i=0; i<N; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
		
	}
	// This will work for -ve no's as well
	public static int maxx(int[] arr) {
		int max = arr[0]; // This line is the change
		int N = arr.length;
		for(int i=0; i<N; i++) {
			if(max<arr[i])
				max=arr[i];
		}
		return max;
	}
}
