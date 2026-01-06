package framework.tests;

import java.util.List;
import java.util.Map;

import framework.utilities.ExcelUtil;

public class ExcelTest {

	public static void main(String[] args) {

		// Read the Excel data using 2D array method.
		String [][] data = ExcelUtil.readData("TestData.xlsx", "LoginFunctionality");
		
		//Print first row, third column value.
		System.out.println("First row, third column value: " + data[0][2]);
		
		// Read the Excel data using a list of maps.
		List<Map<String, String>> dataList = ExcelUtil.readExcel("TestData.xlsx", "LoginFunctionality");
		
		//Print all the data.
		System.out.println(dataList);

	}

}
