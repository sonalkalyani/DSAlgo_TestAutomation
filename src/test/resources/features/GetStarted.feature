
@GetStartedPage
Feature: As a user
  I am able to access homepage and click on Get started button

 @TC_001
 Scenario: On entering the DSAlgo portal url, Home page should be opened
    Given The user should be able to open the browser
    When The user enter the DS_Algo Portal <URL>
    Then The user should landed on the DS_Algo Get Started page with message "You are at the right place"
  

 @TC_002
 Scenario: On clicking Get Started button,Page should navigate to Data Structure Introduction Page
    Given The user should open the DS Algo Portal URL in any supported browser
    When The user clicks the "Get Started" button
    Then The user should land in Data Structure Introduction Page with "register" and "Sign in" links

   
Examples: 
      | URL | 
   		| https://dsportalapp.herokuapp.com/ |