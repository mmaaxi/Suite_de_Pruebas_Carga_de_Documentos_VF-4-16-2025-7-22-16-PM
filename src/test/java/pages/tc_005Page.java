package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

import java.util.List;

public class tc_005Page {
    WebDriver driver;

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToMultipleUploadSection() {
        driver.findElement(By.id("multipleUploadSection")).click();
    }

    public boolean isMultipleUploadSectionEnabled() {
        WebElement section = driver.findElement(By.id("multipleUploadSectionEnabled"));
        return section != null && section.isDisplayed();
    }

    public void selectMultipleValidPDFs() {
        WebElement uploadInput = driver.findElement(By.id("uploadInput"));
        uploadInput.sendKeys("path/to/pdf1.pdf\npath/to/pdf2.pdf");
    }

    public boolean areAllSelectedFilesRecognized() {
        List<WebElement> files = driver.findElements(By.className("recognizedFile"));
        return files.size() > 1;
    }

    public void uploadDocuments() {
        driver.findElement(By.id("uploadButton")).click();
    }

    public boolean areDocumentsUploadedSuccessfully() {
        List<WebElement> uploadedFiles = driver.findElements(By.className("uploadedFile"));
        return uploadedFiles.size() > 1;
    }
}