#demosite automation feature/scenarios
@demotest
Feature: Demo for selenium functions

  #Background:
  #Given User navigates to "dev_url"
  #@chapter1validation
  #Author:Triveni
  #Scenario Outline: Validation of chapter 1 functionalities in demo site
  #When User clicked on "<link>"
  #Then Verify "<message>" is displayed
  #Examples:
  #|link|
  #|https://www.google.com|
  @TestGoogle
  Scenario Outline: Validation of google search functionalities in demo site
    Given User is on google url
    When User Enter the searchKeyword in <data>
    And User clicked on search button
    
    Examples:
    |data|
    |text box|
    
    

     
