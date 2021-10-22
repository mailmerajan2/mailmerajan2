package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.resources.BaseClass;

public class AdactinSearchHotel extends BaseClass {

	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement txtCheckInDate;

	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement txtCheckOutDate;

	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement btnSearch;

	@FindBy(xpath = "//select[@id='location']")
	private WebElement selLoc;

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement selHot;

	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement selRoomType;

	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement noOfRooms;

	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adultsPerRoom;

	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement childrenPerRoom;

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getSelLoc() {
		return selLoc;
	}

	public WebElement getSelHot() {
		return selHot;
	}

	public WebElement getSelRoomType() {
		return selRoomType;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getBtnSearch() {
		return btnSearch;
	}

	public AdactinSearchHotel() {
		PageFactory.initElements(driver, this);
	}
}