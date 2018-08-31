package org.maventest.DemoReg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static void main(String[] args) throws IOException {
		// File loc
		File excelloc = new File("F:\\Softwares\\Selenium\\JyothiWorkspace\\DemoReg\\Excel\\DEMOREG.xlsx");
		// convert to object
		FileInputStream stream = new FileInputStream(excelloc);
		// Workbook
		Workbook w = new XSSFWorkbook(stream);
		// sheet
		Sheet s = w.getSheet("REGDATA");
		// row
		for(int i=0;i<s.getPhysicalNumberOfRows();i++) {
			Row r = s.getRow(i);
			for(int j=0;j<r.getPhysicalNumberOfCells();j++) {
				Cell c =r.getCell(j);
				int type = c.getCellType();
				if(type==1) {
					String name =c.getStringCellValue();
					System.out.println(name);
				}
				if(type==0) {
					double b =c.getNumericCellValue();
				long l = (long)b;
				String name = String.valueOf(l);
				System.out.println(name);
				//System.out.println(c);
			}
		}
	}

	}
}