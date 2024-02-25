package com.coderscampus.Assignment6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileService {

	public List<Sales> readFile(String fileName) throws FileNotFoundException, IOException{
		SaleService service = new SaleService();
		List<Sales> sales = new ArrayList<>();
		try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
			String line = reader.readLine();
			line = reader.readLine();
			while(line != null && line.contains(",")) {
				sales.add(service.createSalesFromString(line));
				line = reader.readLine();
			}
		}
		return sales;
	}
	
	
	public static void main(String[] args) {

	}

}
