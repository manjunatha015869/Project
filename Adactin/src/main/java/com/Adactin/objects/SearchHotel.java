package com.Adactin.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.baseclass.BaseClass;

public class SearchHotel extends BaseClass {
	
	@FindBy(id="location")
	private WebElement givelocation;
	
	@FindBy(id="hotels")
	private WebElement selcthotels;
	
	@FindBy(id="room_type")
	private WebElement selctroomtype;
	
	@FindBy(id="room_nos")
	private WebElement numofrooms;
	
	@FindBy(id="datepick_in")
	private WebElement givecheckindate;
	
	@FindBy(id="datepick_out")
	private WebElement givecheckoutdate;
	
	@FindBy(id="adult_room")
	private WebElement giveadultroom;
	
	@FindBy(id="child_room")
	private WebElement givechildroom;
	
	@FindBy(id="Submit")
	private WebElement submitbtn;
	
	@FindBy(id="Reset")
	private WebElement resetbtn;

	@FindBy(id="checkout_span")
	private WebElement propercheckoutdate;
	
	public WebElement getGivelocation() {
		return givelocation;
	}

	public WebElement getSelcthotels() {
		return selcthotels;
	}

	public WebElement getSelctroomtype() {
		return selctroomtype;
	}
	
	public WebElement getNumofrooms() {
		return numofrooms;
	}

	public WebElement getGivecheckindate() {
		return givecheckindate;
	}

	public WebElement getGivecheckoutdate() {
		return givecheckoutdate;
	}

	public WebElement getGiveadultroom() {
		return giveadultroom;
	}

	public WebElement getGivechildroom() {
		return givechildroom;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getResetbtn() {
		return resetbtn;
	}
	public WebElement getPropercheckoutdate() {
		return propercheckoutdate;
	}

	public SearchHotel() {
	PageFactory.initElements(driver,this);
	
	}	
	
}
