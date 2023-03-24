Feature: Log in

  Scenario: Try to log in with valid credentials
    Given The user goes to Login Screen
    When  He types "alice" "mypassword"
    Then The user should see the message "You are logged in as alice"
