package LC09;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of elements you need to add");
		int N = scanner.nextInt();
		for(int i=0; i<N; i++) {
			int number = scanner.nextInt();
			arrayList.add(number);
		}
		System.out.println(arrayList);
		
		//2D ArrayList 
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		
		ArrayList<Integer> L1 = new ArrayList<Integer>();
		L1.add(10);
		L1.add(20);
		L1.add(30);
		L1.add(40);
		L1.add(50);
		
		list.add(L1);
		
		//System.out.println(list.size());
		
		ArrayList<Integer> L2 = new ArrayList<Integer>();
		L2.add(1);
		L2.add(2);
		L2.add(3);
		L2.add(4);
		L2.add(5);
		
		list.add(L2);
		
		System.out.println(list.size());
	}
}
