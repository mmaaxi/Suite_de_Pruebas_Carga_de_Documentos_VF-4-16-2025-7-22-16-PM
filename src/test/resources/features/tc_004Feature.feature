Feature: Validate upload error due to unstable connection

  Scenario: Validate error notification on document upload with connection issues
    Given I navigate to the document upload page
    When I simulate a connection drop during the upload
    Then the system should detect an interruption and display a connection error
    When I retry the upload after restoring the connection
    Then the system should allow me to successfully reattempt the upload