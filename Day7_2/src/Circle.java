
public class Circle {
	
	
	
	//Constant
	static final double PI = 3.14159265;
	
	//Fields
	double radius;
	String color;
	
	public Circle(String clr, double rad) {
		color = clr;
		radius = rad;
		
	}
	
	
	
	public Circle() {
		color = "black";
		
	}




	@Override //source - generate to string
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
	
	//public String toString() {
		//return "Circle{color="+color+"and radius="+radius+"}";
	//}
	
	
	
	
	
	
	

}
