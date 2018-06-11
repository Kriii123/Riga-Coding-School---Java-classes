
public class Main {

	public static void main(String[] args) {
		
		Rectangle r1 = new Rectangle(5,4);
		
		System.out.println(r1);
		System.out.println("Is it square? " + r1.isSquare());
		System.out.println("Field is " + r1.area() + " and perimeter is " + r1.perimeter());
		
		Rectangle r2 = new Rectangle(6);
		
		System.out.println(r2);
		System.out.println("Is it square? " + r2.isSquare());
		System.out.println("Field is " + r2.area() + " and perimeter is " + r2.perimeter());
		
		Rectangle r3 = new Rectangle(3,8);
		
		System.out.println(r3);
		System.out.println("Is it square? " + r3.isSquare());
		System.out.println("Field is " + r3.area() + " and perimeter is " + r3.perimeter());
		
		Square r = new Square(5);
		System.out.println(r);

	}

}
