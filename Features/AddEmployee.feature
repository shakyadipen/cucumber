Feature:Add Employee in OrangeHRM
  Scenario:Add Employee Details in OrangeHRM
    Given The user launch the chrome browser.
    When User enters URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
    And User enters the Username "Admin" and Password "admin123"
    And User Hits Login
    Then The page title should be "OrangeHRM"
    And User Clicks on Add Employee Tab
    Then User Fills the New Employee Detail
    And User Saves the data of new employee
    Then The User clicks on Logout Button.
    And Close the browser.