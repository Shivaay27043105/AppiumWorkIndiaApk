@appium
Feature: WorkIndia Registeration

  @appium
  Scenario Outline: New user registration
    Given initialise the App
    When User Enters the Name "<name>"
    And User Enters the Phone Number "<mobilenumber>"
    Then User submit the details
    And user select the option
    And user enter the location "<LOCATION>"
    Then user click on the next button
    And user select gender
    And user select qualification
    And user select medium
    And user select language
    And user select Experience
    And user select Age
    And user select interest
    Then User goes to the next page
    And User Select there preference
    And User tells about the Degree
    Then User Select the Language

    Examples: 
      | name     | mobilenumber | LOCATION   |
      | shivam |   6387496251 | Arjun Nagar |
