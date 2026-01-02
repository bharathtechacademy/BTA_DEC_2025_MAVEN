package framework.tests;

import framework.utilities.PDFUtil;

public class PDFTest {

	public static void main(String[] args) {
		
		String pdfData = PDFUtil.readPDF("Data.pdf" , 2, 2);
		System.out.println(pdfData.trim());

	}

}
