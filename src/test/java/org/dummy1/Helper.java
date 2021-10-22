package org.dummy1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Helper {

	private void readValueFromExcel() throws IOException {

	List<LinkedHashMap<String,String>> l = new ArrayList<LinkedHashMap<String,String>>();	
	
	File f = new File("C:\\Users\\AMMU\\mavenautomationtesting-workspace\\MavenSample\\xlsheet\\adactinhotel.xlsx");
	
	FileInputStream fis = new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	wb.getSheet("Sheet1");
		
	}
}