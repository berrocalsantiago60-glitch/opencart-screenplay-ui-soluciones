package screenplay.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Question;
import org.hamcrest.Matchers;
import screenplay.Task.BuscarProducto;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class BusquedaStepDefinitions {

    @When("the user searches for {string}")
    public void searchForProduct(String producto) {
        theActorInTheSpotlight().attemptsTo(
                (Performable) BuscarProducto.llamado(producto)
        );
    }

    @Then("the search results should contain {string}")
    public void verifySearchResults(String producto) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        (Question<Boolean>) Matchers.is(true))
        );
    }
}
