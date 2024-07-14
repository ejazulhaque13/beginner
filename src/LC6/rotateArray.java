package LC6;

import java.util.Scanner;

public class rotateArray {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i=0; i<N; i++) {
		System.out.print(arr[i] + " ");
		}
		rotate(arr);

	}
	public static void rotate(int[] arr) {
		int N = arr.length;
	    int temp = arr[N-1];
	    for(int i=N-2; i>=0; i--) {
	    	arr[i+1]=arr[i];
	    }
		arr[0]=temp;
		for(int i=0; i<N; i++) {
			System.out.print(arr[i] + " ");
			}
	}

}
