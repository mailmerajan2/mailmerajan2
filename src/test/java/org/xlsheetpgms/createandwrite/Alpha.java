package org.xlsheetpgms.createandwrite;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alpha {

	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		
		WebElement selectTag = driver.findElement(By.xpath("//select[@id='Skills']"));
		
		Select select = new Select(selectTag);
		
		List<WebElement> options = select.getOptions();
		
		File f = new File("C:\\Users\\AMMU\\mavenautomationtesting-workspace\\MavenSample\\xlsheet\\newfile.xlsx");
		
		Workbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet("newsheet1");
		
		for (int i = 0; i < options.size(); i++) {
			
			Row row = sheet.createRow(i);
			
			Cell cell = row.createCell(0);
			
			WebElement webElement = options.get(i);
			
			String data = webElement.getText();
			
			cell.setCellValue(data);
			
		}
		
		FileOutputStream fos = new FileOutputStream(f);
		
		wb.write(fos);
		
		System.out.println("Done");
		
	}
}