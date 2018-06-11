
public class Rectangle {

	double garums;
	double platums;
	
public Rectangle() {
		
	}
	public Rectangle(double gar, double plat) {
		super();
		garums = gar;
		platums = plat;
	}
	public Rectangle(double h)  //lai nolasītu kvadrāta malas garumu
	{
		garums = h;
		platums = h;
	}
	
	public boolean isSquare() {
		
		if(garums == platums)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	public double area() {
		return garums*platums;
		
	}
	
	public double perimeter()
	{
		
		return (garums+platums)*2;
		
	}
	@Override
	public String toString() {
		return "Rectangle [garums=" + garums + ", platums=" + platums + "]";
	}
	
	
	
	
	
}