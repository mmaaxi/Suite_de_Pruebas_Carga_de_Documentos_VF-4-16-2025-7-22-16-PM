package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_005Page;

public class tc_005Steps {
    WebDriver driver;
    tc_005Page page = new tc_005Page(driver);

    @Given("el usuario navega a la sección de carga múltiple")
    public void el_usuario_navega_a_la_sección_de_carga_múltiple() {
        page.navigateToMultipleUploadSection();
        Assert.assertTrue(page.isMultipleUploadSectionEnabled());
    }

    @When("el usuario selecciona dos o más documentos PDF válidos")
    public void el_usuario_selecciona_dos_o_más_documentos_PDF_válidos() {
        page.selectMultipleValidPDFs();
        Assert.assertTrue(page.areAllSelectedFilesRecognized());
    }

    @When("el usuario sube los documentos simultáneamente")
    public void el_usuario_sube_los_documentos_simultáneamente() {
        page.uploadDocuments();
    }

    @Then("todos los documentos se cargan sin errores y se muestran en la lista")
    public void todos_los_documentos_se_cargan_sin_errores_y_se_muestran_en_la_lista() {
        Assert.assertTrue(page.areDocumentsUploadedSuccessfully());
    }
}