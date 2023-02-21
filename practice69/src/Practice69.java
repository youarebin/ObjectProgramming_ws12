//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Rectangle rt1 = new Rectangle();
		
		System.out.println("도형의 정보를 입력하세요.");
		System.out.println("중심좌표의 X값: ");
		rt1.setX(sc.nextInt());
		System.out.println("중심좌표의 Y값: ");
		rt1.setY(sc.nextInt());
		
		System.out.println("사각형의 정보를 입력하세요.");
		System.out.println("중심좌표의 X값: ");
		int x = sc.nextInt();
		System.out.println("중심좌표의 Y값: ");
		int y = sc.nextInt();
		System.out.println("가로길이: ");
		int w = sc.nextInt();
		System.out.println("세로길이: ");
		int h = sc.nextInt();
		
		Rectangle rt2 = new Rectangle(x,y,w,h);
		
		System.out.println("만들어진 도형의 정보는 다음과 같습니다.");
		System.out.println(rt1.toString());
		rt2.printInfo();
	}

}
