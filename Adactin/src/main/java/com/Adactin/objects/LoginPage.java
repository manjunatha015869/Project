package com.Adactin.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Adactin.baseclass.BaseClass;

public class LoginPage extends BaseClass {

	@FindBy(id="username")
	private WebElement Username;
	
	@FindBy(id="password")
	private WebElement Password;
	
	@FindBy(id="login")
	private WebElement Loginbtn;

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	public LoginPage() {
	PageFactory.initElements(driver, this);
	}
	}
	
