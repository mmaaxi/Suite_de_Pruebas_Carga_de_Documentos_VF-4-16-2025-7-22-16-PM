package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {

    WebDriver driver;
    By uploadButton = By.id("uploadBtn");
    By successMessage = By.id("successMsg");
    By metadataSection = By.id("metadataSection");
    By contentIntegrityCheck = By.id("contentIntegrity");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPaginaCarga() {
        driver.get("https://example.com/upload");
    }

    public void subirDocumentoPDF(String filePath) {
        driver.findElement(uploadButton).sendKeys(filePath);
    }

    public boolean verificarCargaExitosa() {
        return driver.findElement(successMessage).isDisplayed();
    }

    public void accederMetadatosDocumento() {
        driver.findElement(metadataSection).click();
    }

    public boolean verificarMetadatos() {
        // Lógica para verificar que los metadatos coincidan
        return true; // Ejemplo, se debería implementar la verificación real
    }

    public void verificarIntegridadContenido() {
        driver.findElement(contentIntegrityCheck).click();
    }

    public boolean verificarContenidosNoAlterados() {
        // Lógica para verificar la integridad del contenido
        return true; // Ejemplo, se debería implementar la verificación real
    }
}