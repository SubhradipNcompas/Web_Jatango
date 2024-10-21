@Jatango_Login
Feature: Spring 1 Jatango project scenario-1

  Scenario Outline: User should be able to access the application and be redirected to the homepage
    Given Enter application URL in address bar
    When  Enter User enter the Username from Excel "<SheetName>","<ColumnName>",<rowNumber>
    Then  Enter User enter the Password from Excel "<SheetName>","<ColumnName>",<rowNumber>
    And   Click Sing_In
    Then User should be redirected to the homepage
    Examples:
    |SheetName|ColumnName|rowNumber|
    |Login   |USERNAME| 2         |
    |Login   |PASSWORD| 2         |

#  Scenario: Successfully create a new product
#    Given User on the product creation page
#    When User fill in the product details with valid information
#    And User submit the product creation form
#    And the new product should be listed in the product inventory
#
#  Scenario: Successfully create a new show
#    Given the user is on the shows tab
#    When the user navigates to the shows creation page
#    And the user fills in the show details with valid information
#    And the user submits the show creation form
#    And the user adds the product to the show
#    And the user copies the show's link
#    When the user pastes the link in the browser
#    Then the user should see the newly created show page
#    Then close browser and send to the mail