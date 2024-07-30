

Feature: User Registration
  I want to use this template for my feature file

 
  Scenario: User registration Form
    Given User is on Registration Form
    When User Enter Following details
      | AZ  |Auto | abc@gmail.com |95555|Del
      | Ali  |Selenium | xyz@gmail.com |855|Pune
      |Md  |Java |AXl@gmail.com |5858|Hyderabad
      
      Then Registration Successful
      
      
  Scenario: User Registration with Different data with columns
     Given User is on Registration Form
   When user enter the followings data with columns
      |Firstname|LastName|mailid         |phone no|City|
      | AZ     |Auto     | abc@gmail.com |95555|Del|
      | Ali    |Selenium | xyz@gmail.com |855|Pune|
      |Md      |Java |AXl@gmail.com |5858|Hyderabad|
       
    Then Registration Successful
      
      