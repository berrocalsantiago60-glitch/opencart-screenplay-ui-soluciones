package screenplay.stepdefinitions;

import io.cucumber.java.en.When;
import screenplay.Task.RegistrarseComo;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroStepDefinitions {

    @When("the user fills the form with first name {string}, last name {string}, email {string}, phone {string} and password {string}")
    public void fillRegistrationForm(String firstName, String lastName, String email, String phone, String password) {
        theActorInTheSpotlight().attemptsTo(
                RegistrarseComo.conDatos(firstName, lastName, email, phone, password)
        );
    }

}
