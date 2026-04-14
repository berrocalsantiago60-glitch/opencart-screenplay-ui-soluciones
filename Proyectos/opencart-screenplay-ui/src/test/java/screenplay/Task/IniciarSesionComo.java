package screenplay.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import screenplay.ui.LoginPage;

public class IniciarSesionComo implements Task {

    private final String email;
    private final String password;

    public IniciarSesionComo(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public static Performable conCredenciales(String email, String password) {
        return Tasks.instrumented(IniciarSesionComo.class, email, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(email).into(LoginPage.EMAIL),
                Enter.theValue(password).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
