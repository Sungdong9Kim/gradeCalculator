package gradeCalculator;

public class Course {
	
	public static final int CREDIT_MAJOR = 3;
	public static final int CREDIT_GENERAL = 2;
	
	public final String courseName;
	public final String courseGrade;
	public final int courseCredit;
	
	public Course(String courseName, int credit, String courseGrade) {
		// TODO Auto-generated constructor stub
		this.courseName = courseName;
		this.courseCredit = credit;
		this.courseGrade = courseGrade;
		
	}
	

}
