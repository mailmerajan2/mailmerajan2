package org.main;

import java.util.Scanner;

import org.baseclass.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Alpha {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);

	Base b = new Base();
	
	WebDriver driver = b.getDriver();
	
	System.out.println("Enter the website name to launch: ");
	
	System.out.println("Eg : facebook");
	
	b.loadUrl("https://www."+scan.next()+".com/");
	
	driver.manage().window().maximize();
	
	WebElement weU = driver.findElement(By.id("email"));
	
	System.out.println("Enter the username for login");
	
	b.insertValue(weU, scan.next());
	
	WebElement weP = driver.findElement(By.id("pass"));
	
	System.out.println("Enter the password for login");
	
	b.insertValue(weP, scan.next());
	
	WebElement weL = driver.findElement(By.name("login"));
	
	b.btnClick(weL);
	
	Actions actions = b.actions(driver);
	
	WebElement mouseHoverElement = driver.findElement(By.xpath(""));
	
	b.mouseHover(actions, mouseHoverElement);
	
	WebElement source = driver.findElement(By.xpath("source"));
	
	WebElement target = driver.findElement(By.xpath("target"));
	
	b.dragdrop(actions, source, target);
	
	WebElement rightClickElement = driver.findElement(By.xpath("rightclicktarget"));
	
	b.rightClick(actions, rightClickElement);
	
	WebElement dcElement = driver.findElement(By.xpath("dcTarget"));
	
	b.doubleClick(actions, dcElement);
	
	
	
	
	}
}