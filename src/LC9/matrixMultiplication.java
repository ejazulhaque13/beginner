package LC9;

import java.util.Scanner;

public class matrixMultiplication {
	public static void main(String[] args) {
		// Declaration of 2D array
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of rows of 1st matrix");
		int R1 = scanner.nextInt();
		System.out.println("Enter no. of columns of 1st matrix");
		int C1 = scanner.nextInt();
		int[][] mat1 = new int[R1][C1];
		System.out.println("Enter the elements");
		//Input of the elements
		for(int i=0; i<R1; i++) {
			for(int j=0; j<C1; j++) {
				mat1[i][j] = scanner.nextInt();
			}
		}
		System.out.println("Enter no. of rows of 2nd matrix");
		int R2 = scanner.nextInt();
		System.out.println("Enter no. of columns of 2nd matrix");
		int C2 = scanner.nextInt();
		
		int[][] mat2 = new int[R2][C2];
		for(int i=0; i<R2; i++) {
			for(int j=0; j<C2; j++) {
				mat2[i][j] = scanner.nextInt();
			}
		}
		int[][] mat3 = mul(mat1, mat2);
		print(mat3);
	}
	
	public static int[][] mul(int[][] mat1, int[][] mat2) {
        int R1 = mat1.length;
        int C1 = mat1[0].length;
        int R2 = mat2.length;
        int C2 = mat2[0].length;

        if(C1!=R2) {
        	System.out.println("Cannot multiply");
        }
        int[][] mat3 = new int[R1][C2];
		
        for(int i=0; i<R1; i++) {
        	for(int j=0; j<C2; j++) {
        		int sum=0;
        		for(int k=0; k<C1; k++) {
        			sum = sum + mat1[i][k]*mat2[k][j];
        		}
        		mat3[i][j] = sum;
        	}
        }
        return mat3;
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

