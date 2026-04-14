package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
        public static final Target EMAIL = Target.the("Email field")
                .located(By.id("input-email"));

        public static final Target PASSWORD = Target.the("Password field")
                .located(By.id("input-password"));

        public static final Target LOGIN_BUTTON = Target.the("Login button")
                .located(By.cssSelector("input.btn-primary"));
}
