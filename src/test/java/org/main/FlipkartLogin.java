package org.main;

import java.io.IOException;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartLogin extends Base{

	public static void main(String[] args) throws IOException {
		
	Base b = new Base();
	
	WebDriver d = b.getDriver();
	
	b.loadUrl("https://www.facebook.com/");
	
	WebElement tstUser = d.findElement(By.id("email"));
	
	WebElement txtPass = d.findElement(By.id("pass"));
	
	b.insertValue(tstUser, b.readValueFromExcell(1, "UserName"));
	
	b.insertValue(txtPass, b.readValueFromExcell(1, "Password"));
	
	WebElement txtLogin = d.findElement(By.name("login"));
	
	b.btnClick(txtLogin);
		
	}
}