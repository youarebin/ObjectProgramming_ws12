//컴퓨터학과_20220740_가유빈
public class Rectangle extends Shape{
	private int width, height;
	
	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public Rectangle() {
		setX(0);
		setY(0);
		width = 0;
		height = 0;
	}
	public Rectangle(int width, int height) {
		this();
		this.width = width;
		this.height = height;
	}
	
	double calcArea() {
		return width * height;
	}
	public void printInfo() {
		String rslt = "";
		
		rslt += "사각형 :: 중심좌표 (" + getX() + "," + getY() + ")";
		rslt += " :: 면적 - " + calcArea() + " :: 둘레 - " + calcPerimeter();
		
		System.out.print(rslt);
	}
	public int calcPerimeter() {
		return 2*(width + height);
	}
}//하위클래스의 첫째줄은 this거나 super
