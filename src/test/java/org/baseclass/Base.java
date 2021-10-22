package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	private static WebDriver driver;
	private static Actions actions;
	//private static WebElement webElement;

	public WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;
	}
	
	public void loadUrl(String url) {
		driver.get(url);
	}
	
	public String title() {
		return driver.getTitle();
	}
	
	public void insertValue(WebElement we,String value) {
		we.sendKeys(value);
	}
	
	public void btnClick(WebElement we) {
		we.click();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	
//	public WebElement findElement(String path) {
//		webElement = driver.findElement(By.xpath(path));
//		return webElement;
//	}
	
	public Actions actions(WebDriver driver) {
		actions = new Actions(driver);
		return actions;
	}
	
	public void mouseHover(Actions actions,WebElement we) {
		actions.moveToElement(we).perform();
	}
	
	public void dragdrop(Actions actions,WebElement source,WebElement target) {
		actions.dragAndDrop(source, target).perform();
	}
	
	public void rightClick(Actions actions,WebElement target) {
		actions.contextClick(target).perform();
	}
	
	public void doubleClick(Actions actions,WebElement target) {
		actions.doubleClick(target).perform();
	}
	
	public String readValueFromExcell(int rowNum,String columnName) throws IOException {
		
		List<LinkedHashMap<String,String>> l = new ArrayList<LinkedHashMap<String,String>>();
		
		File f = new File("C:\\Users\\AMMU\\mavenautomationtesting-workspace\\MavenSample\\xlsheet\\adactinhotel.xlsx");
		
		FileInputStream fis = new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheet("Sheet1");
		
		for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
			
			LinkedHashMap<String,String> mp = new LinkedHashMap<String,String>();
			
			String value = "";
			
			Row row = sheet.getRow(i);
			
			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
				
			Cell cell = row.getCell(j);	
			
			if (cell.getCellType()==1) {
				
				value = cell.getStringCellValue();
				
			} else {

				if (DateUtil.isCellDateFormatted(cell)) {
					
					Date date = cell.getDateCellValue();
					
					SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYYY");
					
					value = sdf.format(date);
					
				} else {
					
					double d = cell.getNumericCellValue();
					
					long lv = (long) d;
					
					value = String.valueOf(lv);
					}	
				}
				
			String key = sheet.getRow(0).getCell(j).getStringCellValue();
			mp.put(key, value);
			l.add(mp);
			}
		}
		
		LinkedHashMap<String, String> lhs = l.get(rowNum);
		String dd = lhs.get(columnName);
		return dd;
	}
	
	public void selectdropdown(WebElement sel,int indexValue) {
		
		Select select = new Select(sel);
		
		select.selectByIndex(indexValue);
		
	}
	
}
