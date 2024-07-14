package LC01;

import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class jharkhandElectricity {
	public static void main(String[] args) {
		int N;
		Scanner scanner = new Scanner(System.in);
		N=scanner.nextInt();
		if(N<=200) {
			System.out.println("your bill is: " + "free");
		}else if (N>200 && N<=400) {
			System.out.println("your bill is: " + N*4.45);
		}else if (N>400) {
			System.out.println("your bill is: " + N*6.65);
		}
	}

}
