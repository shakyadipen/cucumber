Feature:Login in OrangeHRM
Scenario:Successful Login in OrangeHRM with Valid Credentials
  Given The user launch the chrome browser.
  When User enters URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
  And User enters the Username "Admin" and Password "admin123"
  And User Hits Login
  Then The page title should be "OrangeHRM"
  Then The User clicks on Logout Button.
  And Close the browser.