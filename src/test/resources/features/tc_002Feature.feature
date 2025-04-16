Feature: Validate document upload with unsupported format

  Scenario: Upload document with unsupported format DOCX
    Given the user navigates to the document upload page
    When the user attempts to select a document in DOCX format
    Then the system rejects the unsupported format
    When the user attempts to upload the document
    Then the system displays an error message indicating unsupported format