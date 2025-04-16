package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {
    WebDriver driver;

    By uploadButton = By.id("upload-button-id");
    By documentList = By.id("document-list-id");
    By documentLink = By.xpath("//a[text()='document-name.pdf']");
    By documentDetails = By.id("document-details-id");
    By documentPreview = By.id("document-preview-id");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }
    
    public void uploadDocument(String documentPath) {
        driver.findElement(uploadButton).sendKeys(documentPath);
    }

    public void goToUploadedDocuments() {
        driver.findElement(documentList).click();
    }

    public void verifyDocumentIsInList(String documentName) {
        driver.findElement(By.xpath("//a[text()='" + documentName + "']")).isDisplayed();
    }

    public void clickOnDocument(String documentName) {
        driver.findElement(By.xpath("//a[text()='" + documentName + "']")).click();
    }

    public void verifyDocumentDetailsAndPreview(String documentName) {
        driver.findElement(documentDetails).isDisplayed();
        driver.findElement(documentPreview).isDisplayed();
    }
}