package com.test1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		// TODO Auto-generated method stub
		File f= new File("Data.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(0);
		Cell c= r.getCell(0);
		String data = c.toString();
		System.out.println(data);
	}

}
