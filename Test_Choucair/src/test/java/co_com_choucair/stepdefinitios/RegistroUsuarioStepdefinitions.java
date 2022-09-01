package co_com_choucair.stepdefinitios;

import co_com_choucair.model.UtestDatos;
import co_com_choucair.questions.Responder;
import co_com_choucair.tasks.*;
import co_com_choucair.userinterfaces.UtestPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistroUsuarioStepdefinitions {
    private UtestPage page;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Sebastian desea registrarse por primera vez en pagina de Utestcom$")
    public void sebastianDeseaRegistrarsePorPrimeraVezEnPaginaDeUtestcom() throws Exception{
        theActorCalled("Sebastian").wasAbleTo(AbrirpaginaUtest.laPagina());
    }


    @When("^El usuario Sebastian diligencia todos los datos requeridos del formulario$")
    public void elUsuarioSebastianDiligenciaTodosLosDatosRequeridosDelFormulario(List<UtestDatos> datos) throws Exception{
        theActorInTheSpotlight().attemptsTo(LlenarPaginaInfoPersonal.laPagina(datos),
                LlenarPaginaDireccion.laPagina(datos),
                LlenarPaginaDispositivos.laPagina(datos),
                LlenarPaginaFinal.laPagina(datos));
    }

    @Then("^El registro se termina con exito cuando aparece el boton de Complete SetUp$")
    public void elRegistroSeTerminaConExitoCuandoApareceElBotonDeCompleteSetUp(List<UtestDatos> datos) throws Exception{
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Responder.paraDatos(datos)));
    }

}
