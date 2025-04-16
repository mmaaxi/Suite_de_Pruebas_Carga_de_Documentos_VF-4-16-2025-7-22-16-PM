package steps;

import pages.tc_001Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class tc_001Steps {
    tc_001Page page = new tc_001Page();

    @Given("Estoy en la página de carga de documentos")
    public void navegarAPaginaDeCargaDeDocumentos() {
        page.openUploadPage();
        assertTrue(page.isUploadPageDisplayed());
    }

    @When("Selecciono un documento PDF válido")
    public void seleccionarDocumentoPDFValido() {
        page.selectPDFDocument("ruta/del/documento.pdf");
        assertTrue(page.isPDFDocumentSelected());
    }

    @When("Subo el documento")
    public void subirElDocumento() {
        page.uploadDocument();
        assertTrue(page.isDocumentUploaded());
    }

    @Then("Verifico mensaje de confirmación de carga exitosa")
    public void verificarMensajeConfirmacion() {
        assertTrue(page.isUploadSuccessMessageDisplayed());
    }
}