package com.Adactin.Stepdefinition;

import com.Adactin.baseclass.BaseClass;
import com.Adactin.objects.LoginPage;
import com.Adactin.objects.SearchHotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {
	
	@Given("^User opens the Chrome Browser$")
	public void user_opens_the_Chrome_Browser() throws Throwable {
	initializeBrowser();	
	}

	@When("^user goes inside the Adactin application$")
	public void user_goes_inside_the_Adactin_application() throws Throwable {
	openApp("https://adactin.com/HotelApp/index.php");	
	}

	@When("^user gives the username in the Username field$")
	public void user_gives_the_username_in_the_Username_field() throws Throwable {
	LoginPage lp = new LoginPage();
	Entertext(lp.getUsername(), "Manjunath");
	}
	
	@When("^user gives the Password in the Password field$")
	public void user_gives_the_Password_in_the_Password_field() throws Throwable {
	LoginPage lp = new LoginPage();
	Entertext(lp.getPassword(), "Vijay@24");
	
	}

	@Then("^user clicks the Login Button$")
	public void user_clicks_the_Login_Button() throws Throwable {
	LoginPage lp = new LoginPage();
	clickbtn(lp.getLoginbtn());
	Thread.sleep(3000);
	}
	@Given("^User Selects the location from dropdown$")
	public void user_Selects_the_location_from_dropdown() throws Throwable {
	SearchHotel sh = new SearchHotel();
	dropdown(sh.getGivelocation(), "Sydney", "Value");
	}
	
	@When("^user selects the hotel from dropdown$")
	public void user_selects_the_hotel_from_dropdown() throws Throwable {
	SearchHotel sh = new SearchHotel();
	dropdown(sh.getSelcthotels(), "Hotel Creek", "Value");
	}

	@When("^user selects the room type$")
	public void user_selects_the_room_type() throws Throwable {
	SearchHotel sh = new SearchHotel();
	dropdown(sh.getSelctroomtype(), "Standard", "Value");
	}

	@When("^user selects the number of rooms$")
	public void user_selects_the_number_of_rooms() throws Throwable {
	SearchHotel sh = new SearchHotel();
	dropdown(sh.getNumofrooms(),"1", "Value");
	
	}

	@When("^user selects the checkin date$")
	public void user_selects_the_checkin_date() throws Throwable {
	SearchHotel sh = new SearchHotel();
	sh.getGivecheckindate().clear();
	Entertext(sh.getGivecheckindate(), "12/02/2020");
	Thread.sleep(2000);
	}

	@When("^user selects the checkout date$")
	public void user_selects_the_checkout_date() throws Throwable {
	SearchHotel sh = new SearchHotel();
	sh.getGivecheckoutdate().clear();
	Entertext(sh.getGivecheckoutdate(), "10/02/2020");
	Thread.sleep(2000);
	}

	@When("^user gives the number of adults per room$")
	public void user_gives_the_number_of_adults_per_room() throws Throwable {
	SearchHotel sh = new SearchHotel();
	dropdown(sh.getGiveadultroom(), "1", "Value");
	}

	@When("^user gives the number of childrens per room$")
	public void user_gives_the_number_of_childrens_per_room() throws Throwable {
	SearchHotel sh = new SearchHotel();
	dropdown(sh.getGivechildroom(), "1", "Value");
	
	}

	@When("^user clicks the search button$")
	public void user_clicks_the_search_button() throws Throwable {
	SearchHotel sh = new SearchHotel();
	clickbtn(sh.getSubmitbtn());
	Thread.sleep(3000);
	
	}

	@Then("^user selects the reset button$")
	public void user_selects_the_reset_button() throws Throwable {
	}

	@Then("^it checks for the proper checkin and checkout date$")
	public void it_checks_for_the_proper_checkin_and_checkout_date() throws Throwable {
	SearchHotel sh = new SearchHotel();
	elementisdispl(sh.getPropercheckoutdate());
	String text = sh.getPropercheckoutdate().getText();
	System.out.println(text);
	Thread.sleep(2000);
	
	}


}
