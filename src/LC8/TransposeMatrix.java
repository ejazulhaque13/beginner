package LC8;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		// Declaration of 2D array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int R = scanner.nextInt();
		System.out.println("Enter no. of columns");
		int C = scanner.nextInt();
		int[][] mat1 = new int[R][C];
		System.out.println("Enter the elements");
		//Input of the elements
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				mat1[i][j] = scanner.nextInt();
			}
		}
		int[][] mat2 = Tpose(mat1);
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(mat2[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] Tpose(int[][] mat) {
		int R = mat.length;
		int C = mat[0].length;
		int[][] Tmat = new int[C][R];
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				Tmat[j][i] = mat[i][j];
			}
		}
		return Tmat;
	}
	
}
	
