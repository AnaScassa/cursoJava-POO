package entities;

public class Produto {

	private String name;
	private double price;
	private double quantity;
	private double n;
	
	public Produto(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	public double n() {
		return n;
	}
	
	public void setN(double n) {
		this.n = n;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public double addProduct() {
		return quantity += n;
	}

	public double lessProduct() {
		return quantity -= n;
	}
	
	@Override
	public String toString() {
		return "Produto: "
			+ name
			+ ", Preço: R$ "
			+ String.format("%.2f", price)
			+ ", Quantidade: "
			+ quantity
			+ ", Total em estoque: R$ "
			+ String.format("%.2f", totalValueInStock());
	}
}
