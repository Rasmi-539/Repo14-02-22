package com.test.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class TestUtility {
	
	@SuppressWarnings("resource")
	public static ArrayList<Object[]> getDataFromExcel() throws IOException {
		
		ArrayList<Object[]> myData = new ArrayList<Object[]>();
		
		FileInputStream file = new FileInputStream("C:\\Users\\rasmirekha.m\\Downloads\\testRegistration.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		
		int rowCount =sheet.getLastRowNum();
		
		for(int row=1;row<=rowCount;row++) {
			XSSFCell firstname = sheet.getRow(row).getCell(0);
			XSSFCell lastname = sheet.getRow(row).getCell(1);
			XSSFCell email = sheet.getRow(row).getCell(2);
			XSSFCell password = sheet.getRow(row).getCell(3);
			
			Object ob[] = {firstname, lastname,email,password};
			myData.add(ob);

		}
		
		
		
		
		
		return myData;
	
	
	}
}

