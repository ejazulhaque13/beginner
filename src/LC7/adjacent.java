package LC7;

import java.util.Scanner;

public class adjacent {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the difference");
		int k = scanner.nextInt();
		System.out.println(adj(arr, k));
		
}
	public static boolean adj(int[] arr, int k) {
		int N = arr.length;
		for(int i=0; i<N-1; i++) {
			if(k==(arr[i]-arr[i+1])) {
				return true;
			}
		}
		return false;
		
	}
}
