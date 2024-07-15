package LC12;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Rectangle R1 = new Rectangle();
		 R1.length = 10;
		 R1.width = 20;
		 System.out.println(R1.area());
		 System.out.println(R1.perimeter());
		 
		 Rectangle R2 = new Rectangle();
		 R2.length = 20;
		 R2.width = 40;
		 System.out.println(R2.area());
		 System.out.println(R2.perimeter());
		 
		 Student  anil; //Object is not created, this is just object reference
		 anil = new Student(); // Now the object is created 
		 anil.rollNo = 1; // Shows that the object is created
		 anil.display();
		 
		 Student anil2;
		 anil2 = new Student();
		 anil2.age=25;
		 anil2.rollNo=2;
		 anil2.name="Anil";
		 anil2.department="CSE";
		 
		 anil2.display();
		 
		 Student P1 = new Student();
		 P1.age = 15;
		 P1.department = "Mech";
		 P1.name = "Pradeep";
		 P1.rollNo=3;
		 
		 P1.display();
		 
		 Student P2 = P1;
		 P2.display();
		 
		 Student P3 = P1;
		 P3.display();
		 
		 P2.department = "ECE";
		 P1.display();
		 
		 newName(P3);
	}
	
	public static void newName(Student student) {
		System.out.println("Enter new name");
		Scanner scanner = new Scanner(System.in);
		student.name = scanner.next();
		student.display();
	}
}
