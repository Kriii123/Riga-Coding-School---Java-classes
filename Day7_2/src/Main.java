
public class Main {

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		c1.color = "red";
		c1.radius = 3.13;
		
		Circle c2 = new Circle("green",14);
		
		Circle c3 = new Circle();
		//c3.color = "black";
		//c3.radius = 14.42;
		
		System.out.println(c1);
		System.out.println(c2.toString());
		System.out.println("c2 has color="+c2.color + " and radius=" +c2.radius);
		System.out.println("c3 has color="+c3.color + " and radius=" +c3.radius);
		
		

	}

}
