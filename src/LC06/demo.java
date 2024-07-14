package LC06;

import java.util.Scanner;

public class demo {
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
		System.out.println();
		System.out.println("The sum is : " + sumOfArray(arr));
	}
	public static int sumOfArray(int[] arr) {
		int sum = 0;
		int N = arr.length;
		for(int i=0; i<N; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
