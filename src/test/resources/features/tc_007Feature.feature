Feature: Validate the correct display in the document list

  Scenario: Validate document upload and display
    Given a valid PDF document is uploaded
    When I navigate to the list of uploaded documents
    Then I should see the document in the list
    When I click on the document to view details
    Then I can see the details and a preview of the document