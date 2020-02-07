package com.Adactin.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Adactin.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:src\\test\\resources\\com\\Adactin\\reports\\adactin.json"},
		features = "src\\test\\java\\com\\Adactin\\Feature\\Adactin.feature",
		glue = "com.Adactin.Stepdefinition",dryRun=false,strict=true)
public class TestRunner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void initializeBrowser() {
		BaseClass.initializeBrowser();
	}
	@AfterClass
	public static void driverquit() {
	BaseClass.driverquit();
	}
		
	}
		
	
