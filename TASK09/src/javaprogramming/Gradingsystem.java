package javaprogramming;

import java.util.Scanner;

public class Gradingsystem {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter the student's mark:");
		int mark = scanner.nextInt();
		
		String grade;
		if (mark >= 90 && mark<=100) {
			grade = "A";	
		} else if (mark >= 80 && mark < 90) {
			grade = "B";
		} else if (mark >=70 && mark < 80) {
			grade = "C";
		} else if (mark >=60 && mark < 70) {
			grade = "D";
		} else if (mark >=50 && mark <60) {
			grade = "E";
		} else {
			grade = "F";
		}
		System.out.println("Grade:"+ grade);
	}

}
