package entities;

import java.util.Date;
import java.text.SimpleDateFormat;

public class UsedProduct extends Product {

	private Date date;
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct() {
	}

	public UsedProduct(String name, Double price, Date date) {
		super(name, price);
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String priceTag() {
		return getName()
				+ " $ "
				+ String.format("%.2f", getPrice())
				+ " (Manufacture date: "
				+ sdf.format(date)
				+ ")";
	}
}
