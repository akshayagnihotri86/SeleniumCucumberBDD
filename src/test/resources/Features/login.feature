#Author : Akshay
#Date : 22 Feb 2022
#Description : Login test
Feature: To test the login functionality of the application


  Scenario Outline: user is able to login with correct credentials
    Given user is on the login page
    When user enters <username> and <password>
    And clicks on sign in button
    Then user is navigated to home page

    Examples: 
      | username | password |
      | jojo     | bean     |

 
  #Scenario Outline: user is able to login with correct credentials
   # Given user is on the login page
    #When user enters <username> and <password>
    #And clicks on sign in button
    #Then user is navigated to home page

    #Examples: 
      #| username | password |
      #| jojo     | bean     |
     # | mojo     | bean     |
