package LC3;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class PatternPrint2 {

/*If N = 5	
* * * * *
* * * * *
* * * * *
* * * * *
* * * * *
	
	*/

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
	
		for(int i=0; i<N; i++) {
			for(int j =0; j<N; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}
