package com.coderscampus.Assignment6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		SaleService service = new SaleService();
		service.salesReport("model3.csv");
		service.salesReport("models.csv");
		service.salesReport("modelx.csv");
	}

}
