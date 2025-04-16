package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_008Page;

public class tc_008Steps {

    tc_008Page page = new tc_008Page();

    @Given("el usuario carga un documento con metadatos embebidos")
    public void uploadDocumentWithMetadata() {
        boolean isUploaded = page.uploadDocument("path/to/document");
        Assert.assertTrue("El documento no se cargó correctamente", isUploaded);
    }

    @When("el usuario extrae los metadatos del documento cargado")
    public void extractDocumentMetadata() {
        page.extractMetadata();
    }

    @Then("el sistema muestra los metadatos correctos conforme al documento")
    public void verifyMetadataDisplayed() {
        Assert.assertTrue("Los metadatos no coinciden con los esperados", page.isMetadataCorrectlyDisplayed());
    }
    
    @Then("los metadatos coinciden con los valores esperados")
    public void compareMetadataToExpected() {
        Assert.assertTrue("Los metadatos no coinciden con los valores esperados", page.compareWithExpectedMetadata());
    }
}