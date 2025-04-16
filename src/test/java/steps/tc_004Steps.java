package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_004Page;
import static org.junit.Assert.assertTrue;

public class tc_004Steps {
    WebDriver driver;
    tc_004Page uploadPage;

    public tc_004Steps() {
        this.driver = Hooks.driver;
        uploadPage = PageFactory.initElements(driver, tc_004Page.class);
    }

    @Given("I navigate to the document upload page")
    public void iNavigateToTheDocumentUploadPage() {
        uploadPage.navigateToUploadPage();
        assertTrue(uploadPage.isUploadPageDisplayed());
    }

    @When("I simulate a connection drop during the upload")
    public void iSimulateAConnectionDropDuringTheUpload() {
        uploadPage.simulateConnectionDrop();
    }

    @Then("the system should detect an interruption and display a connection error")
    public void theSystemShouldDetectAnInterruptionAndDisplayAConnectionError() {
        assertTrue(uploadPage.isConnectionErrorDisplayed());
    }

    @When("I retry the upload after restoring the connection")
    public void iRetryTheUploadAfterRestoringTheConnection() {
        uploadPage.restoreConnectionAndRetryUpload();
    }

    @Then("the system should allow me to successfully reattempt the upload")
    public void theSystemShouldAllowMeToSuccessfullyReattemptTheUpload() {
        assertTrue(uploadPage.isUploadSuccessful());
    }
}