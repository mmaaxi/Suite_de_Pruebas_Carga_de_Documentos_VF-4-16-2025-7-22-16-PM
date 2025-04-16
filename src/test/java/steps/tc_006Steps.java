package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {

    WebDriver driver;
    tc_006Page page;

    @Given("El usuario está en la página de carga de documentos")
    public void el_usuario_en_la_pagina_de_carga() {
        driver = Hooks.getDriver();
        page = new tc_006Page(driver);
        page.navegarPaginaCarga();
    }

    @When("El usuario sube un documento PDF con metadatos correctos")
    public void el_usuario_sube_pdf() {
        page.subirDocumentoPDF("path/to/document.pdf");
    }

    @Then("El documento se carga exitosamente")
    public void documento_cargado_exitosamente() {
        assertTrue(page.verificarCargaExitosa());
    }

    @When("El usuario accede a la descripción y metadatos del documento cargado")
    public void el_usuario_accede_metadatos() {
        page.accederMetadatosDocumento();
    }

    @Then("Los metadatos coinciden con la información original")
    public void metadatos_coinciden() {
        assertTrue(page.verificarMetadatos());
    }

    @When("El usuario verifica la integridad del contenido del documento")
    public void el_usuario_verifica_integridad_contenido() {
        page.verificarIntegridadContenido();
    }

    @Then("El contenido del documento no presenta alteraciones")
    public void contenido_sin_alteraciones() {
        assertTrue(page.verificarContenidosNoAlterados());
    }
}