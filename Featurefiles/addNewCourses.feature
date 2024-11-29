
Feature: Add new Course to cart and checkout
  as an end user I would like to add new course to cart and should be able to logout

  @Smoke
  Scenario: Add new course to cart
    Given User was able to launch the app
    And   User was able to login to app
    And   User was able to load homepage
    When user click add to cart
    Then Courses added to cart
    
  

  #@tag2
 # Scenario Outline: Title of your scenario outline
  # Given I want to write a step with "<email>"
   # When I check for the "<password>" in step
   

    #Examples: 
      #| email  | password |
      #| name1 |     5 |
      #| name2 |     7 |
