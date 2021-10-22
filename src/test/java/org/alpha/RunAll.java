package org.alpha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.AdactinBookAHotel;
import org.pages.AdactinBookingConfirmation;
import org.pages.AdactinHomePage;
import org.pages.AdactinSearchHotel;
import org.pages.AdactinSelectHotel;
import org.resources.BaseClass;

public class RunAll extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {

	getDriver();
	
	loadUrl("http://adactinhotelapp.com/index.php");
	
	AdactinHomePage adaHp = new AdactinHomePage();
	
	insertValue(adaHp.getTxtUser(), "ramrajdee");
		
	insertValue(adaHp.getTxtPass(), "RAJArajan12#");
	
	btnClick(adaHp.getBtnLogin());

	Thread.sleep(5000);
	
	AdactinSearchHotel adaSeh = new AdactinSearchHotel();
	
	selectDropDown(adaSeh.getSelLoc(), 2);
	
	selectDropDown(adaSeh.getSelHot(), 2);
	
	selectDropDown(adaSeh.getSelRoomType(), 2);
	
	selectDropDown(adaSeh.getNoOfRooms(), 2);
	
	insertValue(adaSeh.getTxtCheckInDate(), "19/10/2021");
	
	insertValue(adaSeh.getTxtCheckOutDate(), "19/10/2021");
	
	selectDropDown(adaSeh.getAdultsPerRoom(), 2);
	
	selectDropDown(adaSeh.getChildrenPerRoom(), 2);
	
	btnClick(adaSeh.getBtnSearch());
	
	AdactinSelectHotel adaSlH = new AdactinSelectHotel();
	
	Thread.sleep(2000);

	btnClick(adaSlH.getClickRadio());
	
	btnClick(adaSlH.getClickContinue());
	
	AdactinBookAHotel adaBAH = new AdactinBookAHotel();
	
	Thread.sleep(2000);

	insertValue(adaBAH.getFirstName(), "MS");
	
	insertValue(adaBAH.getLastName(), "DHONI");
	
	insertValue(adaBAH.getBillingAddress(), "Ranchi, India");
	
	insertValue(adaBAH.getCcNo(), "1111222233334444");
	
	selectDropDown(adaBAH.getCcType(), 2);
	
	selectDropDown(adaBAH.getCcMonth(), 2);
	
	selectDropDown(adaBAH.getCcYear(), 2);
		
	insertValue(adaBAH.getCvvNum(),"999");
	
	btnClick(adaBAH.getBookNow());
	
	AdactinBookingConfirmation adaBC = new AdactinBookingConfirmation();
	
	Thread.sleep(9000);
	
	System.out.println(getOrderText(adaBC.getOrderNo()));
	
	quitBrowser();
	
	}
}