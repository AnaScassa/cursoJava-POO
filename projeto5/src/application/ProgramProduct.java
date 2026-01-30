package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) throws Exception {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			System.out.print("Imported (y/n)? ");
			char ch = sc.next().charAt(0);
			
			if (ch == 'y') {
				System.out.print("Custom fee: ");
				double customFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customFee));
			} else {
				System.out.print("Used (y/n)? ");
				char ch2 = sc.next().charAt(0);
				
				if (ch2 == 'y') {
					System.out.print("Date (dd/MM/yyyy): ");
					Date date = sdf.parse(sc.next());
					list.add(new UsedProduct(name, price, date));
				} else {
					list.add(new Product(name, price));
				}
			}
		}
		
		for (Product pro : list) {
			System.out.println(pro.getName() + " - $" + String.format("%.2f", pro.getPrice()) );
		}
		
		sc.close();
	}
}
