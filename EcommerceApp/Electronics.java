package ecommerce.model;

public class Electronics extends Product {
	private String brand;
	private int warrantyInMonths;
	public Electronics(String id, String name, double price, String brand, int warrantyInMonths,int stockQuantity) {
		super(id, name, price,stockQuantity);
		this.brand = brand;
		this.warrantyInMonths = warrantyInMonths;
	}
	@Override
	public void displayDetails() {
	System.out.println("Electronics: " + name + " | Brand: " + brand + " | Warranty: " + warrantyInMonths + " months | Price: " + price);
	}
}

