package application;

import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import services.PrintService;

public class ProgramGenerics {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		PrintService<String> ps = new PrintService<>();
		
		System.out.println("How many values: ");
		int n = sc.nextInt();
				
		for (int i = 0; i < n; i++) {
			String value = sc.next();
			ps.addValue(value);
		}
		
		ps.print();
		String x = ps.first();
		System.out.println("First: " + x);
		
		sc.close();
	}

}
