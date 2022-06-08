package poo;



public class Circle {
	
	private double radius;
	private String color;
	
	
	
	public Circle() {
		radius  = 1.0;
		this.color = "red";
		
	}
	
	public Circle(double radius ) {
		this.radius = radius;
		this.color = "red";
	}
	
	public Circle(double radius, String color ) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.pow(radius, 2) * Math.PI;
	}
	
	// Getter
	public String getColor() {
		return this.color;
	}
	
	// Setter
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
