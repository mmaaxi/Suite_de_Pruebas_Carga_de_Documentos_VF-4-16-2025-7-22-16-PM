package steps;

import pages.tc_009Page;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.*;

public class tc_009Steps {
    WebDriver driver;
    tc_009Page page = new tc_009Page(driver);

    @Given("que se ha cargado un documento PDF válido")
    public void que_se_ha_cargado_un_documento_pdf_valido() {
        page.cargarDocumentoPDFValido();
        page.verificarDocumentoCargado();
    }

    @When("selecciono el documento en la lista")
    public void selecciono_el_documento_en_la_lista() {
        page.seleccionarDocumentoEnLista();
        page.verificarDocumentoSeleccionado();
    }

    @And("ejecuto la acción de eliminación")
    public void ejecuto_la_accion_de_eliminacion() {
        page.eliminarDocumento();
    }

    @Then("el documento ya no aparece en la lista")
    public void el_documento_ya_no_aparece_en_la_lista() {
        page.verificarDocumentoEliminado();
    }
}