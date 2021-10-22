package org.resources;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	protected static WebDriver driver;
	private static Select select;
	
	
	public static WebDriver getDriver() {
		WebDriverManager.chromedriver().setup();
		return driver = new ChromeDriver();
	}
	
	public static void loadUrl(String url) {
		driver.get(url);
	}
	
	public static void insertValue(WebElement ele,String value) {
		ele.sendKeys(value);
	}

	public static void btnClick(WebElement ele) {
		ele.click();
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
	
	public static void selectDropDown(WebElement ele,int indexValue) {
		select = new Select(ele);
		select.selectByIndex(indexValue);
	}
	
	public static String getOrderText(WebElement ele) {
		return ele.getAttribute("value");
	}
}
