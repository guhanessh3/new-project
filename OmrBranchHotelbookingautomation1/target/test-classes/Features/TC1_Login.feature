Feature: Verifying OMR Branch Hotel Login Automation

  Scenario Outline: Verifying login with valid credentials
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify success message after login "Welcome Guhanessh"

    Examples: 
      | username              | password  |
      | ksguhanessh@gmail.com | Learn@123 |

  Scenario Outline: Verifying login with valid credentials with enter key
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>" with enter key
    Then user should verify success message after login "Welcome Guhanessh"

    Examples: 
      | username              | password  |
      | ksguhanessh@gmail.com | Learn@123 |

  Scenario Outline: Verifying login with invalid credentials
    Given user is on OMR Branch Hotel Page
    When user Login "<username>","<password>"
    Then user should verify error message after login "Invalid Login details or Your Password might have expired"

    Examples: 
      | username              | password  |
      | ksguhanessh@gmail.com | Learn@234 |
