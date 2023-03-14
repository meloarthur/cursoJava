package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Grade;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Grade grade = new Grade();
		
		grade.name = scan.nextLine();
		grade.grade1 = scan.nextDouble();
		grade.grade2 = scan.nextDouble();
		grade.grade3 = scan.nextDouble();
		
		grade.calculateGrade();
		
		System.out.println(grade);
		
		scan.close();
		
	}

}
