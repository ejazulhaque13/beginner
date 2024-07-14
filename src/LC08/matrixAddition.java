package LC08;

import java.util.Scanner;

public class matrixAddition {

	public static void main(String[] args) {
		// Declaration of 2D array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int R = scanner.nextInt();
		System.out.println("Enter no. of columns");
		int C = scanner.nextInt();
		int[][] mat1 = new int[R][C];
		int[][] mat2 = new int[R][C];
		System.out.println("Enter the elements");
		//Input of the elements
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				mat1[i][j] = scanner.nextInt();
			}
		}
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				mat2[i][j] = scanner.nextInt();
			}
		}
		int[][] mat4 = new int[R][C];
		mat4=addMatrix(mat1, mat2);
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				System.out.print(mat4[i][j] + " ");
			}
			System.out.println();
		}
		
	}	
	
	public static int[][] addMatrix(int[][] mat1, int[][] mat2) {
		int R = mat1.length;
		int C = mat1[0].length;
		int[][] mat3 =new int[R][C];
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				mat3[i][j]=mat1[i][j]+mat2[i][j];
			}
		}
		return mat3;
	}
}
