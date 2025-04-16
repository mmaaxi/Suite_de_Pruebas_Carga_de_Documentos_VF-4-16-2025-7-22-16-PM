package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_002Page;
import utils.DriverFactory;

public class tc_002Steps {

    WebDriver driver = DriverFactory.getDriver();
    tc_002Page uploadPage = new tc_002Page(driver);

    @Given("the user navigates to the document upload page")
    public void navigateToUploadPage() {
        uploadPage.open();
        Assert.assertTrue("The upload page was not displayed correctly",
                uploadPage.isUploadPageDisplayed());
    }

    @When("the user attempts to select a document in DOCX format")
    public void selectDocxDocument() {
        uploadPage.selectDocxDocument();
        Assert.assertTrue("The DOCX format should not be accepted",
                uploadPage.isUnsupportedFormatMessageDisplayedForSelection());
    }

    @When("the user attempts to upload the document")
    public void uploadDocument() {
        uploadPage.uploadDocument();
    }

    @Then("the system displays an error message indicating unsupported format")
    public void verifyErrorMessage() {
        Assert.assertTrue("The error message for unsupported format was not displayed",
                uploadPage.isUnsupportedFormatErrorMessageDisplayed());
    }
}