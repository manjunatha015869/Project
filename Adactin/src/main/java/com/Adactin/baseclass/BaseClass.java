package com.Adactin.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	public static WebDriver driver;
	public static void initializeBrowser() {

		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manjunatha\\eclipse-workspace\\Adactin\\src\\test\\resources\\com\\Adactin\\driver\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}	
	public static void openApp(String url) {

		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void Entertext(WebElement element, String Value) {
		element.sendKeys(Value);
	}

	public static void clickbtn(WebElement element) {
		element.click();
	}
	public static void dropdown(WebElement element, String Value, String Options) {
		Select s = new Select(element);
		if (Options.equalsIgnoreCase("Value")){
		s.selectByValue(Value);
	} else if (Options.equalsIgnoreCase("Index"))
		{s.selectByIndex(Integer.parseInt(Value));
	
		}else {s.selectByVisibleText(Value);
		}
	}
	
	public static void driverquit() {
		driver.quit();
	}	
	
	public static void mousehover(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();
	}
	
	public static boolean elementisdispl(WebElement element) {
	boolean displayed = element.isDisplayed();
	return displayed;
	}
	
	
	}
	
		
		
