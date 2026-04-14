package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CarritoPage {

    public static final Target ADD_TO_CART_BUTTON = Target.the("Add to cart button")
            .located(By.id("button-cart"));

    public static final Target CART_COUNT = Target.the("Cart count")
            .located(By.cssSelector("#cart-total"));
}
