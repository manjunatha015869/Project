Feature: Adactin Hotel Booking

Scenario: Login Page

Given User opens the Chrome Browser
When user goes inside the Adactin application
And user gives the username in the Username field
And user gives the Password in the Password field
Then user clicks the Login Button

Scenario: Registration Page

Given User Selects the location from dropdown
When user selects the hotel from dropdown
And user selects the room type 
And user selects the number of rooms
And user selects the checkin date
And user selects the checkout date
And user gives the number of adults per room
And user gives the number of childrens per room
And user clicks the search button
Then user selects the reset button
Then it checks for the proper checkin and checkout date

