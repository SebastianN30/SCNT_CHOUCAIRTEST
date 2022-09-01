package co_com_choucair.questions;

import co_com_choucair.model.UtestDatos;
import co_com_choucair.userinterfaces.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<UtestDatos> datos;

    public Responder(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Responder paraDatos(List<UtestDatos> datos) {
        return new Responder(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto_boton = Text.of(PaginaFinal.BOTON_SETUP).viewedBy(actor).asString();
        return datos.get(0).getStrVersion().equals(texto_boton);
    }
}
