package LC10;

public class printAllAscii {

	public static void main(String[] args) {
		
		for(int i=33; i<=128; i++) {
			char ch = (char)i;
			System.out.println(ch + " : " +i);
		}
	}
}
