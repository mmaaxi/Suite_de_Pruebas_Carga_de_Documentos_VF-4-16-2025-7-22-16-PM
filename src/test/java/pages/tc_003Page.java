package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_003Page {

    WebDriver driver;

    By uploadPage = By.id("uploadPage");
    By oversizedDocumentInput = By.id("fileInput");
    By uploadButton = By.id("uploadButton");
    By sizeErrorMessage = By.id("sizeErrorMessage");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void selectOversizedDocument() {
        driver.findElement(oversizedDocumentInput).sendKeys("/path/to/oversized/document.txt");
    }

    public void tryUploadDocument() {
        driver.findElement(uploadButton).click();
    }

    public boolean isSizeErrorMessageDisplayed() {
        return driver.findElement(sizeErrorMessage).isDisplayed();
    }
}