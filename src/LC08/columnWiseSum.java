package LC08;

import java.util.Scanner;

public class columnWiseSum {
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
		colwisesum(mat);
	}
	
	
	public static void colwisesum(int[][] arr) {
		int R = arr.length;
		int C = arr[0].length;
		for(int i=0; i<C; i++) {
			int sum=0;
			for(int j=0; j<R; j++) {
				sum=sum+arr[j][i];
			}
			System.out.println(sum);
		}
		
	}
}


