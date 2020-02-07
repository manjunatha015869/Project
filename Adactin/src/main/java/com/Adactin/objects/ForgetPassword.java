package com.Adactin.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.baseclass.BaseClass;

public class ForgetPassword extends BaseClass {
	
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement ForgetPasswordLink;
	
	@FindBy(className = "login_title") 
	private WebElement ForgetPasswordformHeader;
	
	@FindBy(id="emailadd_recovery")
	private WebElement RecoveryEmailField;
	
	@FindBy(id="Submit")
	private WebElement Emailpswdbtn;
	
	@FindBy(id="Reset")
	private WebElement Resetbtn;

	public WebElement getForgetPasswordLink() {
		return ForgetPasswordLink;
	}

	public WebElement getForgetPasswordformHeader() {
		return ForgetPasswordformHeader;
	}

	public WebElement getRecoveryEmailField() {
		return RecoveryEmailField;
	}

	public WebElement getEmailpswdbtn() {
		return Emailpswdbtn;
	}

	public WebElement getResetbtn() {
		return Resetbtn;
	}
	
	public ForgetPassword() {
	PageFactory.initElements(driver, this);
	}
	
}
