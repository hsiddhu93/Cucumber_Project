Feature: Booking hotel by adactin application

Scenario: Login the application
Given user launches the adactin application
When Enter the username in user textbox
And Enter the password in pass textbox
And clicks on the login button
Then verify the homepage and navigate to search hotel page

Scenario: Search for hotel
When User select the location 
And User select the hotel
And User select the Room type 
And User select number of Room 
And User select the Check-In 
And User select the Check-Out 
And User select the no of adult 
And User select the no of children
Then User valid search  hotel


Scenario Outline: Login Sauce application
Given user launches the application
When user enter a valid "<username>" in username textbox
And user enter a valid "<password>" in pasword textbox
And click on the submit button 
Then verfies the homepage 

Examples: 
|username|password|
|standard_user|secret_sauce|
|problem_user|secret_sauce|
