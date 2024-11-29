Feature: As an end user
  I would be able to register as a new user

	@DDT
  Scenario Outline: Register new user
    Given user was able to access the application
    When user is able to click new User? SignUp button
    And user check if signup is enabled or not
    And User enters name "M Test"
    And user enters email "test@1234@email.com"
    And user enter password "Test!23"
    And User select interests
    And User select gender
    And user select state
    And user select hobbies
    Then user click sign up button

    Examples: 
      | name    | email           | password |
      | M Test  | mtest@emailcom  | test@123 |
      | M Test2 | mtest1@emailcom | test@123 |
      | M Test3 | mtest2@emailcom | test@123 |
