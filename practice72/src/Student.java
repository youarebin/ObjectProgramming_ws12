//컴퓨터학과_20220740_가유빈
public class Student {
	private int id, tuition;
	private double gpa;
	
	public void setTuition(int tuition) {this.tuition = tuition;}
	public void setGpa(double gpa) {this.gpa = gpa;}
	
	public int getTuition() {return tuition;}
	public double getGpa() {return gpa;}
	public int getId() {return id;}
	
	public Student() {
		this.id = 0;
		this.tuition = 0;
		this.gpa = 0;
	}
	public Student(int id, int tuition, double gpa) {
		this.id = id;
		this.tuition = tuition;
		this.gpa = gpa;
	}
	
	public String toString() {
		String rslt = "";
		
		rslt += "학번: " + getId();
		rslt += ", 등록금: " + getTuition();
		rslt += ", 평균등급: " + String.format("%.2f",getGpa());
		
		return rslt;
	}
}
