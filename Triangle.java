package inheritance;

public class Triangle extends Shape{
	//method of triangle
	double area;
	float base,height;
	//method
	public void areaoftriangle() {
		area = 0.5*base*height;
		System.out.println("Area of the triangle");
	}
	
}
