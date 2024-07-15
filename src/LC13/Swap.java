package LC13;

public class Swap {

	public static void main(String[] args) {
		int x =10;
		int y =20;
		swap(x, y);
		System.out.println(x + " " + y);
		
		Data d = new Data();
		d.x=10;
		d.y=20;
		d.swap2(d);
		
		System.out.println(d.x + " " + d.y);
		
	}
	// pass by value 
	public static void swap(int x1, int y1) {
		int temp = x1;
		x1 = y1;
		y1 = temp;
		System.out.println(x1 + " " + y1);
	}


	
	public static class Data{
		int x;
		int y;
		public static void swap2(Data d1) {

			int temp = d1.x;
			d1.x = d1.y;
			d1.y = temp;
			System.out.println(d1.x + " " + d1.y);
		}

	}
}
