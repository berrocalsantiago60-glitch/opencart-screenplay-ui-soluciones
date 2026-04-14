package screenplay.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class BusquedaPage {

    public static final Target SEARCH_BOX = Target.the("Search box")
            .located(By.name("search"));

    public static final Target SEARCH_BUTTON = Target.the("Search button")
            .located(By.cssSelector("button.btn-default"));

    public static final Target RESULTS = Target.the("Search results")
            .located(By.cssSelector("div.product-layout"));
}
