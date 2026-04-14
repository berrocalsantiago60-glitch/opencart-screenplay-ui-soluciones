package screenplay.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.ui.CarritoPage;

public class ContadorDelCarrito implements Question<Integer>{

    public static ContadorDelCarrito valor() {
        return new ContadorDelCarrito();
    }

    @Override
    public Integer answeredBy(Actor actor) {
        String texto = Text.of(CarritoPage.CART_COUNT).viewedBy(actor).asString();
        return Integer.parseInt(texto.replaceAll("[^0-9]", ""));
    }
}
