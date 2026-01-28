package entities;

public class Produto {

	public String name;
	public double price;
	public double quantity;
	public double n;

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
