package co_com_choucair.tasks;

import co_com_choucair.userinterfaces.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirpaginaUtest implements Task {

    private UtestPage utestPage;

    public static AbrirpaginaUtest laPagina() {
        return Tasks.instrumented(AbrirpaginaUtest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestPage),
                Click.on(UtestPage.JOIN));
    }
}
