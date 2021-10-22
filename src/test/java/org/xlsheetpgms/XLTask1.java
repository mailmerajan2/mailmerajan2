package org.xlsheetpgms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLTask1 {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\AMMU\\mavenautomationtesting-workspace\\MavenSample\\xlsheet\\alpha.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sh = wb.getSheet("cricplayers");
		
		for (int i = 0; i < sh.getPhysicalNumberOfRows(); i++) {
			
			Row rw = sh.getRow(i);
			
			for (int j = 0; j < rw.getPhysicalNumberOfCells(); j++) {
				
				if (rw.getCell(j).getCellType()==0) {
					
					if (DateUtil.isCellDateFormatted(rw.getCell(j))) {	
						
						System.out.print(new SimpleDateFormat("dd-MMM-yyyy").format(rw.getCell(j).getDateCellValue())+"  ");	
						
					}else {
						System.out.print(String.valueOf((long)rw.getCell(j).getNumericCellValue())+"  ");
					}		
				} else {		
					System.out.print(rw.getCell(j)+"  ");		
				}	
			}System.out.println();
		}	
	}
}