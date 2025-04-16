package steps;

import io.cucumber.java.en.*;

import pages.tc_010Page;
import static org.junit.Assert.assertTrue;

public class tc_010Steps {

    tc_010Page tc010Page = new tc_010Page();

    @Given("que el usuario está en la página de carga de documentos")
    public void que_el_usuario_esta_en_la_pagina_de_carga_de_documentos() {
        tc010Page.navigateToUploadPage();
    }

    @When("el usuario carga un documento PDF válido")
    public void el_usuario_carga_un_documento_PDF_valido() {
        tc010Page.uploadPDF();
    }

    @Then("el documento se carga correctamente")
    public void el_documento_se_carga_correctamente() {
        assertTrue(tc010Page.isUploadSuccessful());
    }

    @When("el usuario accede al sistema de auditoría")
    public void el_usuario_accede_al_sistema_de_auditoria() {
        tc010Page.accessAuditSystem();
    }

    @Then("se registra una entrada correspondiente a la acción de carga")
    public void se_registra_una_entrada_correspondiente_a_la_accion_de_carga() {
        assertTrue(tc010Page.isAuditLogEntryPresent());
    }

    @When("el usuario verifica la información en el log de auditoría")
    public void el_usuario_verifica_la_informacion_en_el_log_de_auditoria() {
        tc010Page.verifyAuditLogDetails();
    }

    @Then("el log contiene detalles precisos de la acción y el usuario que realizó la carga")
    public void el_log_contiene_detalles_precios_de_la_accion_y_el_usuario_que_realizo_la_carga() {
        assertTrue(tc010Page.isAuditLogDetailsCorrect());
    }
}