//컴퓨터학과_20220740_가유빈
public class Circle {
	double radius;
	
	public Circle() {
		radius = 0;
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	public double getRadius() {return radius;}
	public double getArea() {return radius*radius*3.14;}
}
