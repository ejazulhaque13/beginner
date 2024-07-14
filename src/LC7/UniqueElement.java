package LC7;

import java.util.Scanner;

public class UniqueElement {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the no of array elements");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}		
		System.out.println(" The unique element is: "  +  " " + unique(arr) );
	}	

	public static int unique(int[] arr) {
		int N = arr.length;
		for(int i=0; i<N; i++) {
			int count=0;
			int k = arr[i];
			for(int j=0; j<N;j++) {
				if(k==arr[j])
					count++;
			}
			if(count==1)
				return k;
		}
		return -1;
	}
}
