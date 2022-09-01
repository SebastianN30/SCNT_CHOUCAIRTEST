package co_com_choucair.tasks;

import co_com_choucair.model.UtestDatos;
import co_com_choucair.userinterfaces.PaginaInfoPersona;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co_com_choucair.userinterfaces.PaginaInfoPersona.*;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co_com_choucair.userinterfaces.PaginaInfoPersona.*;

public class LlenarPaginaInfoPersonal implements Task {

    private List<UtestDatos> datos;

    public LlenarPaginaInfoPersonal(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaInfoPersonal laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarPaginaInfoPersonal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(ANO_NACIMIENTO),
                Click.on(BOTON_SEGUIR)
        );
    }
}
