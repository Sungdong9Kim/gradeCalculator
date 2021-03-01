package gradeCalculator;

import java.util.ArrayList;

public class GradeCalculator {
	
	int priviousTotalCredit;
	double priviousAverageGrade;
	String studentName;	
	
	ArrayList<Course> courseList = new ArrayList<>();
	
	public GradeCalculator(String student, double grade, int credit) {
		// TODO Auto-generated constructor stub
		this.studentName = student;
		this.priviousAverageGrade = grade;
		this.priviousTotalCredit = credit;
	}
	
	public void addCourse(Course course) {
		courseList.add(course);
	}
	
	public void print() {
		
		int totalCredit = 0;
		double totalAverageGrade = 0;
		int thisCredit = 0;
		double thisTotalGrade = 0;
		
		for (Course course : courseList) {
			switch (course.courseGrade) {
			case "A+": 
				thisTotalGrade += 4.5 * course.courseCredit;
				break;
			case "A": 
				thisTotalGrade += 4.0 * course.courseCredit;
				break;
			case "B+": 
				thisTotalGrade += 3.5 * course.courseCredit;
				break;
			case "B": 
				thisTotalGrade += 3.0 * course.courseCredit;
				break;
			case "C+": 
				thisTotalGrade += 2.5 * course.courseCredit;
				break;
			case "C": 
				thisTotalGrade += 2.0 * course.courseCredit;
				break;
			case "D+": 
				thisTotalGrade += 1.5 * course.courseCredit;
				break;
			case "D": 
				thisTotalGrade += 1.0 * course.courseCredit;
				break;
			case "F": 
				thisTotalGrade += 0 * course.courseCredit;
				break;
			default:
				break;
			
			}
			thisCredit += course.courseCredit;
			
		}
		
		totalCredit = priviousTotalCredit + thisCredit;
		totalAverageGrade = ((priviousAverageGrade * priviousTotalCredit) + thisTotalGrade)/totalCredit;
		
		System.out.println("직전 학기 성적: "+priviousAverageGrade+" (총 "+priviousTotalCredit+"학점)");
		System.out.println("이번 학기 성적: "+thisTotalGrade/thisCredit+" (총 "+thisCredit+"학점)");
		System.out.println("전체 예상 학점: "+totalAverageGrade+" (총 "+totalCredit+"학점)");
		
	}

}
