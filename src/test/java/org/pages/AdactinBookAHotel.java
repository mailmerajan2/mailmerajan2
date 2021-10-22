package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class AdactinBookAHotel extends BaseClass{
	
	@FindBy(xpath="//input[@id='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@id='last_name']")
	private WebElement lastName;
	
	@FindBy(xpath="//textarea[@id='address']")
	private WebElement billingAddress;
	
	@FindBy(xpath="//input[@id='cc_num']")
	private WebElement ccNo;
	
	@FindBy(xpath="//input[@id='cc_cvv']")
	private WebElement cvvNum;
	
	@FindBy(xpath="//input[@id='book_now']")
	private WebElement bookNow;
	
	@FindBy(xpath="//input[@id='cc_type']")
	private WebElement ccType;
	
	@FindBy(xpath="//input[@id='cc_exp_month']")
	private WebElement ccMonth;
	
	@FindBy(xpath="//input[@id='cc_exp_year']")
	private WebElement ccYear;
	
	public WebElement getCcType() {
		return ccType;
	}

	public WebElement getCcMonth() {
		return ccMonth;
	}

	public WebElement getCcYear() {
		return ccYear;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBillingAddress() {
		return billingAddress;
	}

	public WebElement getCcNo() {
		return ccNo;
	}

	public WebElement getCvvNum() {
		return cvvNum;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	public AdactinBookAHotel() {
		PageFactory.initElements(driver, this);
	}
}