package screenplay.Task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import screenplay.ui.CarritoPage;

public class AgregarAlCarrito  implements Task{

    private final String producto;

    public AgregarAlCarrito(String producto) {
        this.producto = producto;
    }

    public static AgregarAlCarrito elProducto(String producto) {
        return Tasks.instrumented(AgregarAlCarrito.class, producto);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Aquí podrías navegar al producto y luego hacer clic en "Add to cart"
        actor.attemptsTo(
                Click.on(CarritoPage.ADD_TO_CART_BUTTON)
        );
    }
}
