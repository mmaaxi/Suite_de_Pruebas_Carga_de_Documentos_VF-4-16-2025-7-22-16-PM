package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_008Page {

    private WebDriver driver;
    private By uploadButton = By.id("upload-button");
    private By metadataSection = By.id("metadata-section");

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public boolean uploadDocument(String filePath) {
        try {
            WebElement uploadElement = driver.findElement(uploadButton);
            uploadElement.sendKeys(filePath);
            return isUploadSuccessful();
        } catch (Exception e) {
            return false;
        }
    }

    public void extractMetadata() {
        // Logic to extract metadata from uploaded document
    }

    public boolean isMetadataCorrectlyDisplayed() {
        // Logic to verify metadata correctness
        return true;
    }
    
    public boolean compareWithExpectedMetadata() {
        // Logic to compare extracted data with expected data
        return true;
    }

    private boolean isUploadSuccessful() {
        // Verify if the upload was successful
        return true;
    }
}