package org.firstclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch {

	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	
	driver.manage().window().maximize();
	
	WebElement txtUserName = driver.findElement(By.xpath("//input[@id='email']"));
	txtUserName.sendKeys("rajanrrr.222@gmail.com");
	
	WebElement txtPwd = driver.findElement(By.xpath("//input[@id='pass']"));
	txtPwd.sendKeys("Dhoni");
	
	WebElement btnLogin = driver.findElement(By.xpath("(//div[@class='_6ltg'])[1]"));
	btnLogin.click();
	
	}
}