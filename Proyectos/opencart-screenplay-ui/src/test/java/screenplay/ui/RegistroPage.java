package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistroPage {

    public static final Target FIRSTNAME = Target.the("First Name")
            .located(By.id("input-firstname"));

    public static final Target LASTNAME = Target.the("Last Name")
            .located(By.id("input-lastname"));

    public static final Target EMAIL = Target.the("Email")
            .located(By.id("input-email"));

    public static final Target TELEPHONE = Target.the("Telephone")
            .located(By.id("input-telephone"));

    public static final Target PASSWORD = Target.the("Password")
            .located(By.id("input-password"));

    public static final Target PRIVACY_POLICY = Target.the("Privacy Policy")
            .located(By.name("agree"));

    public static final Target CONTINUE_BUTTON = Target.the("Continue")
            .located(By.cssSelector("input.btn-primary"));
}
