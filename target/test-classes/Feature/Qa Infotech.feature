Feature: Verify the website

@runningtests1
Scenario: Open the FindElements
Given Open the Website
Then Verify the Website
When Find how many links are avaliable
Then Click on the last link

@runningtests1
Scenario: Open the FindElement
#Given Searching element on the webpage
 When  Enter text in search box
Then Click on the search button
Then Go back to homepage
When Get the full location of element 
Then Again go onto forward page
Then Refresh the webpage

@runningtests1
Scenario: Generate the manage
Given Navigate to homepage
When Create cookies
Then Turning webpage into full screen
Then Get the X coordinates and Y coordinates
Then Refresh the webpage
Then finally close the window

