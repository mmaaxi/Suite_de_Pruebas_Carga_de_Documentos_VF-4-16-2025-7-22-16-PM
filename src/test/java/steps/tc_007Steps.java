package steps;

import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.tc_007Page;

public class tc_007Steps {
    WebDriver driver;
    tc_007Page documentPage = new tc_007Page(driver);

    @When("a valid PDF document is uploaded")
    public void uploadValidPDFDocument() {
        documentPage.uploadDocument("path/to/valid-document.pdf");
    }

    @When("I navigate to the list of uploaded documents")
    public void navigateToDocumentList() {
        documentPage.goToUploadedDocuments();
    }

    @Then("I should see the document in the list")
    public void verifyDocumentInList() {
        documentPage.verifyDocumentIsInList("document-name.pdf");
    }

    @When("I click on the document to view details")
    public void clickOnDocument() {
        documentPage.clickOnDocument("document-name.pdf");
    }

    @Then("I can see the details and a preview of the document")
    public void verifyDocumentDetailsAndPreview() {
        documentPage.verifyDocumentDetailsAndPreview("document-name.pdf");
    }
}