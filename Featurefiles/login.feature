Feature: As an end user, User should be able to perform all the basic operations.
				 User can enrol, make payment and can also buy multiple courses.
	@Smoke
  Scenario: User is able to login to app
    Given 	User can access the application
    When 		User enters "admin@email.com" in email field
    And 		User enters "admin@123" in password field
    And 		User can click on login
    Then 		User can verify manage filed on home page
    
