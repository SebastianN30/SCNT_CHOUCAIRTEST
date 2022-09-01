package co_com_choucair.tasks;

import co_com_choucair.model.UtestDatos;
import co_com_choucair.userinterfaces.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co_com_choucair.userinterfaces.PaginaFinal.*;

public class LlenarPaginaFinal implements Task {
    private List<UtestDatos> datos;

    public LlenarPaginaFinal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaFinal laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarPaginaFinal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrPassword()).into(PASSWORD),
                Enter.theValue(datos.get(0).getStrPassword()).into(CONFIRMAR_PASSWORD),
                Click.on(CHECK_STAY_INFO),
                Click.on(CHECK_I_HAVE),
                Click.on(CHECK_I_READ),
                Click.on(BOTON_SETUP)
        );
    }
}
