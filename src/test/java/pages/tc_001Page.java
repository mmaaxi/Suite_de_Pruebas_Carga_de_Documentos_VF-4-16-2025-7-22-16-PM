package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class tc_001Page {
    private WebDriver driver;
    private By uploadButton = By.id("uploadBtn");
    private By selectFileInput = By.id("fileInput");
    private By successMessage = By.id("successMsg");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void openUploadPage() {
        driver.get("http://direccion-de-tu-sitio.com/cargaDocumentos");
    }

    public boolean isUploadPageDisplayed() {
        return driver.findElement(uploadButton).isDisplayed();
    }

    public void selectPDFDocument(String filePath) {
        WebElement fileInput = driver.findElement(selectFileInput);
        fileInput.sendKeys(filePath);
    }

    public boolean isPDFDocumentSelected() {
        String uploadedFileName = driver.findElement(selectFileInput).getAttribute("value");
        return uploadedFileName.endsWith(".pdf");
    }

    public void uploadDocument() {
        driver.findElement(uploadButton).click();
    }

    public boolean isDocumentUploaded() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public boolean isUploadSuccessMessageDisplayed() {
        return driver.findElement(successMessage).getText().equals("Documento cargado exitosamente");
    }
}