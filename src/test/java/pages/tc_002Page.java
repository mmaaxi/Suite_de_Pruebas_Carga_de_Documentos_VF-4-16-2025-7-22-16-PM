package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_002Page {
    
    private WebDriver driver;
    
    private By uploadPageIdentifier = By.id("uploadPage");
    private By selectFileInput = By.id("fileInput");
    private By uploadButton = By.id("uploadButton");
    private By unsupportedFormatSelectionMessage = By.id("formatErrorSelection");
    private By unsupportedFormatErrorMessage = By.id("formatErrorMessage");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void open() {
        driver.get("http://example.com/upload");
    }

    public boolean isUploadPageDisplayed() {
        return driver.findElement(uploadPageIdentifier).isDisplayed();
    }

    public void selectDocxDocument() {
        driver.findElement(selectFileInput).sendKeys("path/to/document.docx");
    }

    public boolean isUnsupportedFormatMessageDisplayedForSelection() {
        return driver.findElement(unsupportedFormatSelectionMessage).isDisplayed();
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).click();
    }

    public boolean isUnsupportedFormatErrorMessageDisplayed() {
        return driver.findElement(unsupportedFormatErrorMessage).isDisplayed();
    }
}