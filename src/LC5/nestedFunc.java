package LC5;

import LC1.max;

public class nestedFunc {

	public static void main(String[] args) {
		int x = sum(prod(sum(10, 20),15),30);
		System.out.println(x);
	}
	public static int sum(int A, int B) {
		return A+B;
	}
    public static int prod(int A, int B) {
    	return A*B;
	}
    //declaring the scope of the variables 
    {
    	int x =10;
    }
}
