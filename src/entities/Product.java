package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;
	
	public double totalValueInStock() {
		return this.price * this.quantity;
	}
	
	public void addProducts(int qt) {
		this.quantity += qt;
	}
	
	public void removeProducts(int qt) {
		this.quantity -= qt;
	}
	
}
