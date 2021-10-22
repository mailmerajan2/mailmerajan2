package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class AdactinHomePage extends BaseClass{
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement txtUser;
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement txtPass;
	
	@FindBy(xpath="//input[@id='login']")
	private WebElement btnLogin;

	public WebElement getTxtUser() {
		return txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public AdactinHomePage() {
		PageFactory.initElements(driver, this);
	}
}
