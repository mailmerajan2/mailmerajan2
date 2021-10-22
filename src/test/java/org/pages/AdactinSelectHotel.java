package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class AdactinSelectHotel extends BaseClass{
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement clickRadio;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement clickContinue;

	public WebElement getClickRadio() {
		return clickRadio;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}
	
	public AdactinSelectHotel() {
		PageFactory.initElements(driver, this);
	}
}