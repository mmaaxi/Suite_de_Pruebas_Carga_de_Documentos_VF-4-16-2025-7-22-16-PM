package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_003Page;

public class tc_003Steps {

    WebDriver driver;
    tc_003Page page = PageFactory.initElements(driver, tc_003Page.class);

    @Given("el usuario navega a la página de carga")
    public void el_usuario_navega_a_la_pagina_de_carga() {
        page.navigateToUploadPage();
    }

    @When("el usuario selecciona un documento que supera el límite de tamaño permitido")
    public void el_usuario_selecciona_un_documento_que_supera_el_límite_de_tamaño_permitido() {
        page.selectOversizedDocument();
    }

    @When("intenta subir el documento")
    public void intenta_subir_el_documento() {
        page.tryUploadDocument();
    }

    @Then("el sistema muestra un mensaje de error sobre el tamaño excedido")
    public void el_sistema_muestra_un_mensaje_de_error_sobre_el_tamaño_excedido() {
        Assert.assertTrue(page.isSizeErrorMessageDisplayed());
    }
}