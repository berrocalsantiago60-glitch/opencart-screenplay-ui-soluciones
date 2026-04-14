package screenplay.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import screenplay.Questions.ContadorDelCarrito;
import screenplay.Task.AgregarAlCarrito;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class CarritoStepDefinitions {

    @When("the user adds {string} to the cart")
    public void addProductToCart(String producto) {
        theActorInTheSpotlight().attemptsTo(
                AgregarAlCarrito.elProducto(producto)
        );
    }

    @Then("the cart should show {int} item")
    public void verifyCartCount(int cantidad) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(ContadorDelCarrito.valor(), equalTo(cantidad))
        );
    }
}
