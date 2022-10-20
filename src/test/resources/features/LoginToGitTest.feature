#Feature: Test scenario for Git
#  Scenario: Login to GitHub
#    Given User is on "Login Page"
#    When User enters username as "AncaSava" and password on "Login Page"
#    Then User is successfully navigated to the "https://github.com/"
#    And User info "AncaSava" on "Home Page" is present on navigation panel
#
#
#  Scenario Outline: Login to GitHub (negative)
#    Given User is on "Login Page"
#    When User enters username as <username> and password as <password> on "Login Page"
#    Then User gets error message "Incorrect username or password." on "Login Page"
#    Examples:
#    | username | password |
#    | xxxxx    | wrrr     |
#    | qwert    |  grtd    |
Feature: Test scenario for Amazon filtering
Background: Open Amazon Home Page
  Given Amazon Home Page is opened

  Scenario Filter after the chosen brand
    Given User  enters  headphones in the searchBar on "TopBar"
    When user clicks on sonyOption on "SearchResultsPage"
    Then User is provided with a list of results in the "SearchResultsPage";

