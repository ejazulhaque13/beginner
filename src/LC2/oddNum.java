package LC2;

public class oddNum {
	public static void main(String[] args) {
		int i=1;
		//printing all odd numbers from 1-10
		while (i<=10) {
			System.out.println(i);
			i=i+2;
		}
		int j = 4;
		//printing all the multiples of 4 from 1-20
		while (j<=20) {
			System.out.println(j);
		    j=j+4;
		}
		int k=2;
		//printing all the power of 2
		while (k<=100) {
			System.out.println(k);
			k=k*2;
		}
		int l=1;
		//printing all the perfect square from 1-100
		while (l*l<=100) {
			System.out.println(l*l);
			l=l+1;
		}
	}

}
