package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By documentList = By.id("documentList");
    By deleteButton = By.id("deleteButton");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void cargarDocumentoPDFValido() {
        driver.findElement(uploadButton).sendKeys("path/to/validDocument.pdf");
    }

    public void verificarDocumentoCargado() {
        // Implementar lógica para verificar que el documento se ha cargado correctamente
    }

    public void seleccionarDocumentoEnLista() {
        driver.findElement(documentList).click();
    }

    public void verificarDocumentoSeleccionado() {
        // Implementar lógica para verificar que el documento es seleccionable
    }

    public void eliminarDocumento() {
        driver.findElement(deleteButton).click();
    }

    public void verificarDocumentoEliminado() {
        // Implementar lógica para verificar que el documento ya no aparece en la lista
    }
}