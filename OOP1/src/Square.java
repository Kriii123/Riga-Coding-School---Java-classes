
public class Square extends Rectangle {
	
	public Square(double side) {
		super(side,side); // izsauc konstruktoru no Rectangle klases
	}
	
	public void test() {
		boolean isSquare = super.isSquare(); //super lieto lai norādītu, ka metode jāizsauc no vecāku klases
		double area = super.area();
		double perimeter = super.perimeter();
		
		double randomSum = garums+platums;
		
	}

	@Override
	public String toString() {
		
		return "Square [garums=" + garums + ", platums=" + platums + "]";
	}

	
	
	
	

}
