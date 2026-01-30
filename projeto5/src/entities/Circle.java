package entities;

import java.awt.Color;

public class Circle extends Shape{

	private Double radius;
	
	public Circle() {
	}
		
	public Circle(entities.enums.Color color, Double radius) {
		this.radius = radius;
	}

	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}	
}
