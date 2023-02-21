//컴퓨터학과_20220740_가유빈
public class Practice71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle(10.0);
		Cylinder cy1 = new Cylinder(0.0,0.0);
		Cylinder cy2 = new Cylinder(5.0,3.0);
		
		System.out.println("Circle 객체에 대한 정보입니다.");
		System.out.println("반지름: " + String.format("%.2f",c.getRadius()));
		System.out.println("단면적: " + String.format("%.2f",c.getArea()));
		
		System.out.println("Cylinder 객체 1에 대한 정보입니다.");
		System.out.println("반지름: " + String.format("%.2f",cy1.getRadius()));
		System.out.println("단면적: " + String.format("%.2f",cy1.getArea()));
		System.out.println("높이: " + String.format("%.2f",cy1.getHeight()));
		System.out.println("부피: " + String.format("%.2f",cy1.getVolume()));
		
		System.out.println("Cylinder 객체 2에 대한 정보입니다.");
		System.out.println("반지름: " + String.format("%.2f",cy2.getRadius()));
		System.out.println("단면적: " + String.format("%.2f",cy2.getArea()));
		System.out.println("높이: " + String.format("%.2f",cy2.getHeight()));
		System.out.println("부피: " + String.format("%.2f",cy2.getVolume()));
	}

}
