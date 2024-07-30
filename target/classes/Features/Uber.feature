#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Booking a Cab Through Uber
  I want to use this template for my feature file


  Scenario: Booking A Sedan Cab
    Given User want to book a car type "SEDAN"
    When USer Select car "Sedan" pick up "Delhi" drop "Hyderabad"
    Then Driver start the journey
    And Driver end the journey
    Then User paid the 10000 INR
 @Regression @SMOKE
  Scenario: Booking A Mini Cab
    Given User want to book a car type "Mini"
    When USer Select car "Sedan" pick up "Jaipur" drop "Jodhpur"
    Then Driver start the journey
    And Driver end the journey
    Then User paid the 8000 INR
    
    @SMOKE
    Scenario: Booking A Suv Cab
    Given User want to book a car type "Suv"
    When USer Select car "Suv" pick up "Pune" drop "Mumbai"
    Then Driver start the journey
    And Driver end the journey
    Then User paid the 5000 INR

