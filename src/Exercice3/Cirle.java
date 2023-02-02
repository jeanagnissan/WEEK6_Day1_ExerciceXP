package Exercice3;

public class Cirle {

	private double radius = 1.0;
	private  String color =  "red";
	

	public Cirle() {
	}
	
	public Cirle(int radius) {
		this.radius = radius;

	}
	
	public Cirle(int radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Cirle [radius=" + radius + ", color=" + color + "]";
	}

}
