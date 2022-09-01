package co_com_choucair.tasks;


import co_com_choucair.model.UtestDatos;
import co_com_choucair.userinterfaces.PaginaDispositivos;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

import static co_com_choucair.userinterfaces.PaginaDispositivos.*;
import static org.openqa.selenium.Keys.*;
public class LlenarPaginaDispositivos implements Task {
    private List<UtestDatos> datos;

    public LlenarPaginaDispositivos(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaDispositivos laPagina(List<UtestDatos> datos) {
        return Tasks.instrumented(LlenarPaginaDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CONTENEDOR_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrComputador()).into(COMPUTADOR).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_VERSION),
                Enter.theValue(datos.get(0).getStrVersion()).into(VERSION).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_LENGUAJE),
                Enter.theValue(datos.get(0).getStrLenguaje()).into(LENGUAJE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_CELULAR),
                Enter.theValue(datos.get(0).getStrCelular()).into(CELULAR).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_MODELO),
                Enter.theValue(datos.get(0).getStrModelo()).into(MODELO).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_SISTEMA),
                Enter.theValue(datos.get(0).getStrSistema()).into(SISTEMA).thenHit(ARROW_DOWN, ENTER),
                Click.on(BOTON_SEGUIR_PASSWORD)
        );
    }
}
