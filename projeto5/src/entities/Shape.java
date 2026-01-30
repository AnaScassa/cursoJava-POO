package entities;

import java.awt.Color;

public abstract class Shape {
	private Color color;
	
	public Shape() {
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	// a classe que herdar Shape vai precisar sobrescrever esse metodo 
	public abstract double area();
			
}
