package LC13;

import java.util.ArrayList;
import java.util.Scanner;

import javax.print.attribute.Size2DSyntax;

public class Modify {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int N = scanner.nextInt();
		int[] arr = new int[N];
		for(int i=0; i<N; i++) {
			arr[i] = scanner.nextInt();
		}
		for(int i=0; i<N; i++) {
			System.out.print(arr[i]+" ");
		}
		modifyArray(arr);
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add(40);
		arrayList.add(50);
		
		modifyList(arrayList);
		System.out.println(arrayList);
		
	}
	
	public static ArrayList<Integer> modifyList(ArrayList<Integer> arrayList) {
		int N = arrayList.size();
		for(int i=0; i<N; i++) {
			arrayList.set(i,arrayList.get(i) +100); 
		}
		return arrayList;
	}
	
	public static int[] modifyArray(int[] arr) {
		int N = arr.length;
		System.out.println();
		for(int i=0; i<N; i++) {
			arr[i] = arr[i] + 10;
			System.out.print(arr[i] + " ");
		}
		return arr;
		
	}
	
}
