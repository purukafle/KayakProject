package com.utilities;



import java.io.File;
import java.io.FileInputStream;

public class ExcelManager {
	private String filePath;
	//private static Workbook wb;
	//private static Sheet sh;
	
	public ExcelManager(String excelFile,String SheetName) {
		try {
			File file=new File(excelFile);
			filePath=file.getAbsolutePath();
			System.out.println("reading the excel file " + filePath);
			FileInputStream fis=new FileInputStream(file);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	
	
	}
public static void main(String[] args) {
	ExcelManager em=new ExcelManager("src/test/resources/testData/worksheet.xlsx", "Sheet1");
	System.out.println(em);
}
}