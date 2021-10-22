package org.main;

import java.io.IOException;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdactinHotelBooking extends Base{

	public static void main(String[] args) throws IOException, InterruptedException {

		Base base = new Base();
		
		WebDriver driver = base.getDriver();
		
		base.loadUrl("http://adactinhotelapp.com/");
		
		driver.manage().window().maximize();
		
		WebElement txtUser = driver.findElement(By.xpath("//input[@id='username']"));
		
		WebElement txtPass = driver.findElement(By.xpath("//input[@id='password']"));
		
		WebElement btnLog = driver.findElement(By.xpath("//input[@id='login']"));
		
		base.insertValue(txtUser, "ramrajdee");
		
		base.insertValue(txtPass, "RAJArajan12#");
		
		base.btnClick(btnLog);
		
		WebElement selLocation = driver.findElement(By.xpath("//select[@id='location']"));
		
		base.selectdropdown(selLocation, 2);
		
		WebElement selHotels = driver.findElement(By.xpath("//select[@id='hotels']"));
		
		base.selectdropdown(selHotels, 2);
		
		WebElement selRoomType = driver.findElement(By.xpath("//select[@id='room_type']"));
		
		base.selectdropdown(selRoomType, 2);
		
		WebElement selNoOfRooms = driver.findElement(By.xpath("//select[@id='room_nos']"));
		
		base.selectdropdown(selNoOfRooms, 2);
		
		WebElement txtCheckIn = driver.findElement(By.xpath("//input[@id='datepick_in']"));
		
		base.insertValue(txtCheckIn, "20/10/2021");
		
		WebElement txtCheckOut = driver.findElement(By.xpath("//input[@id='datepick_out']"));
		
		base.insertValue(txtCheckOut, "22/10/2021");
		
		WebElement selAdults = driver.findElement(By.xpath("//select[@id='adult_room']"));
		
		base.selectdropdown(selAdults, 2);
		
		WebElement selChildren = driver.findElement(By.xpath("//select[@id='child_room']"));
		
		base.selectdropdown(selChildren, 2);
		
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='Submit']"));
		
		base.btnClick(btnSearch);
		
		WebElement btnRoundClick = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));
			
		base.btnClick(btnRoundClick);
		
		WebElement btnContinueClick = driver.findElement(By.xpath("//input[@id='continue']"));
		
		base.btnClick(btnContinueClick);
		
		WebElement txtFirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
		
		base.insertValue(txtFirstName, base.readValueFromExcell(1,"First Name"));
		
		WebElement txtLasttName = driver.findElement(By.xpath("//input[@id='last_name']"));
		
		base.insertValue(txtLasttName, base.readValueFromExcell(1,"Last Name"));
		
		WebElement txtBillAddr = driver.findElement(By.xpath("//textarea[@id='address']"));
		
		base.insertValue(txtBillAddr, base.readValueFromExcell(2,"Billing Address"));
		
		WebElement txtCCNum = driver.findElement(By.xpath("//input[@id='cc_num']"));
		
		base.insertValue(txtCCNum, base.readValueFromExcell(3,"Credit Card No"));
		
		WebElement txtCCType = driver.findElement(By.xpath("//select[@id='cc_type']"));
		
		base.selectdropdown(txtCCType, 3);
		
		WebElement selExpDatMon = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
		
		base.selectdropdown(selExpDatMon, 11);
		
		WebElement selExpDatYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
		
		base.selectdropdown(selExpDatYear, 10);
		
		WebElement txtCvvNum = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
		
		base.insertValue(txtCvvNum, "123");
		
		WebElement btnBookNow = driver.findElement(By.xpath("//input[@id='book_now']"));
		
		base.btnClick(btnBookNow);
		
		Thread.sleep(9000);
		
		WebElement orderID = driver.findElement(By.xpath("//input[@id='order_no']"));
		
		System.out.println("ORDER ID is : "+orderID.getAttribute("value"));
		
		base.quitBrowser();
	}
}