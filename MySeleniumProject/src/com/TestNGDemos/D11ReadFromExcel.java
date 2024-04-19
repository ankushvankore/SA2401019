package com.TestNGDemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class D11ReadFromExcel {
	String fPath = "D:\\StarAgile\\Demos\\SA2401019\\LoginData.xlsx";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	@Test
	public void readData() {
		/*row = sheet.getRow(0);
		cell = row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		cell = row.getCell(1);
		System.out.println(cell.getStringCellValue());
		
		cell = row.getCell(2);
		System.out.println(cell.getStringCellValue());*/
		
		int totalRows = sheet.getPhysicalNumberOfRows();
		//int totalCells = sheet.getRow(0).getPhysicalNumberOfCells();
		
		for(int i = 0; i < totalRows; i++)
		{
			row = sheet.getRow(i);
			int totalCells = sheet.getRow(i).getPhysicalNumberOfCells();
			for(int j = 0; j < totalCells; j++)
			{
				cell = row.getCell(j);
				System.out.print(cell.getStringCellValue() + "\t");
			}
			System.out.println();
		}
		
	}

	@BeforeTest
	public void beforeTest() throws IOException {
		file = new File(fPath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheet("Sheet1");
	}

	@AfterTest
	public void afterTest() throws IOException {
		wb.close();
		fis.close();
	}

}
