package entities;

public class Triangle {

	public double a;
	public double b;
	public double c;
	
	public double calculaArea() {
		
		double p = (this.a + this.b + this.c) / 2;
		double area = Math.sqrt(p * ((p - this.a) * (p - this.b) * (p - this.c)));
		
		return area;
		
	}
	
}
