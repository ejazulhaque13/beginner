package LC6;

import java.util.Scanner;

public class minOfArray {
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Min in the array is : " + min(arr));
		
	}
	// Edge case this func will only work for +ve numbers
	public static int min(int[] arr) {
		int min = arr[0];
		int N = arr.length;
		for(int i=0; i<N; i++) {
			if(min>arr[i])
				min=arr[i];
		}
		return min;
		
	}

}
