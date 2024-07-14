package LC8;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// Declaration of 2D array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int R = scanner.nextInt();
		System.out.println("Enter no. of columns");
		int C = scanner.nextInt();
		int[][] mat = new int[R][C];
		System.out.println("Enter the elements");
		//Input of the elements
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				mat[i][j] = scanner.nextInt();
			}
		}
		print(mat);
	}
	public static void print(int[][] arr) {
		int N = arr.length;
		int M = arr[0].length;
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
