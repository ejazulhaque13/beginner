package LC07;

import java.util.Scanner;

public class search {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the element need to be searched");
		int k = scanner.nextInt();
		for(int i=0; i<N; i++) {
			if(arr[i]==k) {
				System.out.println("element found");
			}
		}
		System.out.println("element not found");
	}

}
