package co.corona.stepDefinitions;

import co.corona.driver.SeleniumWebDriver;
import co.corona.interactions.NavegarAtras;
import co.corona.questions.ValidacionBtnCarrito;
import co.corona.questions.ValidacionElementoHome;
import co.corona.tasks.SeleccionarProducto;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import java.io.IOException;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ValidacionElementoStepDefinitions {

    @Before
    public void before()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }
    @Dado("^Que me encuentro en la pagina principal de (.*)$")
    public void queMeEncuentroEnLaPaginaPrincipalDeHttpsCoronaCo(String Url) {
        OnStage.theActorCalled("Narhen")
                .can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(Url)));
    }

    @Cuando("^hago clic en un producto aleatorio$")
    public void hagoClicEnUnProductoAleatorio() {
        OnStage.theActorInTheSpotlight().attemptsTo(SeleccionarProducto.on());
    }

    @Cuando("^revisa el boton de agregar al carrito$")
    public void revisaElBotonDeAgregarAlCarrito() {
        OnStage.theActorInTheSpotlight().should(seeThat(
                "El actor puede ver", ValidacionBtnCarrito.ValidacionBtnAgregarAlCarrito(),
                Matchers.equalTo(true)));
        OnStage.theActorInTheSpotlight().attemptsTo(NavegarAtras.on());
    }

    @Entonces("^Regreso a la pagina principal$")
    public void regresoALaPaginaPrincipal() {
        OnStage.theActorInTheSpotlight().should(seeThat(
                "El actor puede ver", ValidacionElementoHome.ValidacionLblUnicoHome(),
                Matchers.equalTo(true)));
    }
}
