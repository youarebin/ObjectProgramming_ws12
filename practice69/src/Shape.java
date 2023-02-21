//컴퓨터학과_20220740_가유빈
public class Shape {
	private int x, y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Shape() {
		x = 0;
		y = 0;
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "도형 :: 중심좌표 (" + getX() + "," + getY() + ")";
		
		return rslt;
	}
	
	public void setX(int x) {this.x = x;}
	public void setY(int y) {this.y = y;}
	
	public int getX() {return x;}
	public int getY() {return y;}
}
