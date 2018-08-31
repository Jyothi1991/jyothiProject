package org.maventest.DemoReg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Base {
	public String getData(int rowNum,int cellNum) throws IOException
	{
		File excelloc=new File("F:\\Softwares\\Selenium\\JyothiWorkspace\\DemoReg\\Excel\\DEMOREG.xlsx");
		FileInputStream stream = new FileInputStream(excelloc);
		Workbook w =new XSSFWorkbook(stream);
		Sheet s = w.getSheet("REGDATA");
		Row r = s.getRow(rowNum);
		Cell c= r.getCell(cellNum);
		String name ="";
		if(c.getCellType()==1) {
			name=c.getStringCellValue();
		}
		if(c.getCellType()==0) {
			name=String.valueOf((long)c.getNumericCellValue());
		}
		return name;
			
			
		}
		
		
	

	
	}


