//컴퓨터학과_20220740_가유빈
import java.util.Scanner;

public class Practice72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Student s;
		Undergraduate ug;
		Graduate g;
		
		System.out.println("첫번째 학생의 학번: ");
		int sId = sc.nextInt();
		System.out.println("첫번째 학생의 등록금: ");
		int sTuition = sc.nextInt();
		System.out.println("첫번째 학생의 평균등급: ");
		double sGpa = sc.nextDouble();
		s = new Student(sId,sTuition,sGpa);
		
		System.out.println("두번째 학생의 학번: ");
		int ugId = sc.nextInt();
		System.out.println("두번째 학생의 등록금: ");
		int ugTuition = sc.nextInt();
		System.out.println("두번째 학생의 평균등급: ");
		double ugGpa = sc.nextDouble();
		System.out.println("두번째 학생의 학년: ");
		int ugYear = sc.nextInt();
		ug = new Undergraduate(ugId,ugTuition,ugGpa,ugYear);
		
		System.out.println("세번째 학생의 학번: ");
		int gId = sc.nextInt();
		System.out.println("세번째 학생의 등록금: ");
		int gTuition = sc.nextInt();
		System.out.println("세번째 학생의 평균등급: ");
		double gGpa = sc.nextDouble();
		System.out.println("세번째 학생의 연구실: ");
		String gLab = sc.next();
		g = new Graduate(gId,gTuition,gGpa,gLab);
		
		System.out.println("입력된 학생들의 정보입니다.");
		System.out.println(s.toString());
		System.out.println(ug.toString());
		System.out.println(g.toString());
	}

}
