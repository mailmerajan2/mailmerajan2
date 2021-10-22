package org.junitpgms;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	private static ChromeDriver driver;
	private static Select select;
	

	@BeforeClass
	public static void browserLauch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void browserClose() {
		driver.quit();
	}
	
	@Before
	public void before() throws InterruptedException {
		Thread.sleep(1000);
	}
	
	@After
	public void after() throws InterruptedException {
		Thread.sleep(5000);
	}
	
	@Test
	public void testCase1() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramrajdee");
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("RAJArajan12#");
		
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}
	
	@Test
	public void testCase2() {
				
		WebElement locElement = driver.findElement(By.xpath("//select[@id='location']"));
		
		select = new Select(locElement);
		
		select.selectByIndex(select.getOptions().size()-3);

		WebElement hotElement= driver.findElement(By.xpath("//select[@id='hotels']"));
		
		select = new Select(hotElement);
		
		select.selectByIndex(select.getOptions().size()-3);
		
		WebElement selRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		
		select = new Select(selRoomType);
		
		select.selectByIndex(select.getOptions().size()-3);

		WebElement selNoOfRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		
		select = new Select(selNoOfRooms);
		
		select.selectByIndex(select.getOptions().size()-3);
		
		driver.findElement(By.xpath("//input[@id='datepick_in']")).sendKeys("18/10/2021");

		driver.findElement(By.xpath("//input[@id='datepick_out']")).sendKeys("20/10/2021");

		WebElement selAdults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		
		select = new Select(selAdults);
		
		select.selectByIndex(select.getOptions().size()-3);

		WebElement selChildren = driver.findElement(By.xpath("//select[@id='child_room']"));
		
		select = new Select(selChildren);
		
		select.selectByIndex(select.getOptions().size()-3);

		driver.findElement(By.xpath("//input[@id='Submit']")).click();
		
	}
	
	@Test
	public void testCase3() {
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
	}
	
	@Test
	public void testCase4() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Rooban");
		
		driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Mesiya");
		
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Thoraipakkam, OMR Road");
		
		driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("1234567890123456");
		
		WebElement txtCCType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		
		select = new Select(txtCCType);
		
		select.selectByIndex(select.getOptions().size()-2);
		
		WebElement selExpDatMon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		
		select = new Select(selExpDatMon);
		
		select.selectByIndex(select.getOptions().size()-2);
		
		WebElement selExpDatYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		
		select = new Select(selExpDatYear);
		
		select.selectByIndex(select.getOptions().size()-2);
		
		driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("101");
		
		driver.findElement(By.xpath("//input[@id='book_now']")).click();
		
		Thread.sleep(9000);
		
	}
	
	@Test
	public void testCase5() {
		
		WebElement orderID = driver.findElement(By.xpath("//input[@id='order_no']"));
		
		System.out.println("ORDER ID is : "+orderID.getAttribute("value"));
	}
	
}