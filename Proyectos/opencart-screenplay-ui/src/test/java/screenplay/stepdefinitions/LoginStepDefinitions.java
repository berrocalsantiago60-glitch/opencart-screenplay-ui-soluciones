package screenplay.stepdefinitions;

import io.cucumber.java.en.When;
import screenplay.Task.IniciarSesionComo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
public class LoginStepDefinitions {

    @When("the user enters email {string} and password {string}")
    public void enterCredentials(String email, String password) {
        theActorInTheSpotlight().attemptsTo(
                IniciarSesionComo.conCredenciales(email, password)
        );
    }
}
