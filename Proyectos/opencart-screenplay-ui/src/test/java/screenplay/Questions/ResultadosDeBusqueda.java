package screenplay.Questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import screenplay.ui.BusquedaPage;

public class ResultadosDeBusqueda implements Question<Boolean> {

    private final String producto;

    public ResultadosDeBusqueda(String producto) {
        this.producto = producto;
    }

    public static String contiene(String producto) {
        return new ResultadosDeBusqueda(producto).toString();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return Text.of(BusquedaPage.RESULTS).viewedBy(actor).asString().contains(producto);
    }
}
