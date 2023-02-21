//컴퓨터학과_20220740_가유빈
public class Cylinder extends Circle{
	double height;
	
	public Cylinder() {
		height = 0;
	}
	public Cylinder(double radius) {
		super(radius);
	}
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	public double getHeight() {return height;}
	public double getVolume() {return getArea()*getHeight();}
}
