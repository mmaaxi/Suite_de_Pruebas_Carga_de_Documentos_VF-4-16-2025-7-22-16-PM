package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_010Page {

    WebDriver driver;

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        // Implementación para navegar a la página de carga de documentos
        driver.get("http://example.com/upload");
    }

    public void uploadPDF() {
        // Implementación para cargar un documento PDF
        driver.findElement(By.id("upload")).sendKeys("path/to/document.pdf");
        driver.findElement(By.id("submit")).click();
    }

    public boolean isUploadSuccessful() {
        // Verificar si la carga fue exitosa
        return driver.findElement(By.id("successMessage")).isDisplayed();
    }

    public void accessAuditSystem() {
        // Implementación para acceder al sistema de auditoría
        driver.get("http://example.com/audit");
    }

    public boolean isAuditLogEntryPresent() {
        // Verificar si hay una entrada en el log de auditoría
        return driver.findElement(By.xpath("//table[@id='auditLogs']//tr[contains(., 'document.pdf')]")).isDisplayed();
    }

    public void verifyAuditLogDetails() {
        // Implementación para verificar detalles del log de auditoría
        // Puede incluir revisar varias columnas para confirmar la información precisa
    }

    public boolean isAuditLogDetailsCorrect() {
        // Verificar si los detalles del log de auditoría son correctos
        // Placeholder para una mejor verificación de detalles como el nombre del usuario, acción, etc.
        return true;
    }
}