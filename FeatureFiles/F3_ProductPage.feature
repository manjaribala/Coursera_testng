Feature: Error Handling in Form Submission

  Scenario: Fill Form with invalid input and capture error message
    Given the user nagivate to Coursera page
    When the user navigates to the Enterprise section
    And the user goes to Courses for Campus under Product
    And the user fills the Form with invalid email
    Then the user should capture and display the error message

  #@regression
  #Scenario: Fill Form with invalid input and capture error message
    #Given the user nagivate to Coursera page
    #When the user navigates to the Enterprise section
    #And the user goes to Courses for Campus under Product
    #And the user fills the Form with invalid email
    #Then the user should capture and display the error message
#
  #@sanity
  #Scenario: Fill Form with invalid input and capture error message
    #Given the user nagivate to Coursera page
    #When the user navigates to the Enterprise section
