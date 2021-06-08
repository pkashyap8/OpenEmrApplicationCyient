package com.cyient.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo1Test {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file =new FileInputStream("src/test/resources/testdata/OpenEMRData.xlsx");
		
		XSSFWorkbook book=new XSSFWorkbook(file);
		
		XSSFSheet sheet = book.getSheet("validCredentialTest");
		//XSSFRow row = sheet.getRow(0);
		//XSSFCell cell = row.getCell(1);
		
		//DataFormatter format=new DataFormatter();
	
		//String cellValue = format.formatCellValue(cell);
		//System.out.println(cellValue);
		
		for(int r=0; r<3; r++) {
			for(int p=0; p<4; p++ ) {
				XSSFRow row = sheet.getRow(r);
				XSSFCell cell = row.getCell(p);
				
				DataFormatter format=new DataFormatter();
			
				String cellValue = format.formatCellValue(cell);
				System.out.println(cellValue);
			}
		}
		
		//String cellValue= cell.getStringCellValue();
		//System.out.println(cellValue);
	}

}
