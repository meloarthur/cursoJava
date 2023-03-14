package entities;

public class Grade {

	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	public double finalGrade;
	
	public String toString() {
		if (this.finalGrade < 60) {
			return "FINAL GRADE = " + String.format("%.2f", this.finalGrade) + "\nFAILED\nMISSING " + String.format("%.2f", (60 - this.finalGrade)) + " POINTS";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", this.finalGrade) + "\nPASS";
		}
	}
	
	public void calculateGrade() {
		this.finalGrade = (this.grade1 + this.grade2 + this.grade3) / 3;
	}
	
}
