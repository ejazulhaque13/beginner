package LC05;

import java.util.Scanner;

public class LCMHCF {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int lcm=0;
		int hcf=0;
		// lcm x hcf = A x B
		for(int i=1; i<=A&&i<=B; i++) {
			if(A%i ==0 && B%i==0) {
				hcf=i; // Here we got the LCM
			}
		}
		// According to the above formulae
		lcm = (A*B)/hcf;
		System.out.println("LCM is : " +lcm);
		System.out.println("HCF is : " +hcf);
	}

}
