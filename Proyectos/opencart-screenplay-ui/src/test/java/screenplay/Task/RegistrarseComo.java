package screenplay.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import screenplay.ui.RegistroPage;

public class RegistrarseComo implements Task {
        private final String firstName, lastName, email, phone, password;

        public RegistrarseComo(String firstName, String lastName, String email, String phone, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.phone = phone;
            this.password = password;
        }

        public static RegistrarseComo conDatos(String firstName, String lastName, String email, String phone, String password) {
            return Tasks.instrumented(RegistrarseComo.class, firstName, lastName, email, phone, password);
        }

        @Override
        public <T extends Actor> void performAs(T actor) {
            actor.attemptsTo(
                    Enter.theValue(firstName).into((Target) RegistroPage.FIRSTNAME),
                    Enter.theValue(lastName).into((Target) RegistroPage.LASTNAME),
                    Enter.theValue(email).into((Target) RegistroPage.EMAIL),
                    Enter.theValue(phone).into((Target) RegistroPage.TELEPHONE),
                    Enter.theValue(password).into((Target) RegistroPage.PASSWORD),
                    Click.on((Target) RegistroPage.PRIVACY_POLICY),
                    Click.on((Target) RegistroPage.CONTINUE_BUTTON)
            );
        }
    }


