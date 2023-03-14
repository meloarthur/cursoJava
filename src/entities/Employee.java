package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double tax;
	
	public String toString() {
		return this.name + ", $ " + String.format("%.2f", this.netSalary());
	}
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary *= (1 + (percentage / 100));
	}
	
}
