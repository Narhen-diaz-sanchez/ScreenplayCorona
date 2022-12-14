package co.corona.stepDefinitions;

import co.corona.driver.SeleniumWebDriver;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;

public class ValidacionElementoStepDefinitions {
    @Dado("^Que me encuentro en la pagina principal de (.*)$")
    public void queMeEncuentroEnLaPaginaPrincipalDeHttpsCoronaCo(String Url) {
        OnStage.theActorCalled("Juan")
                .can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(Url)));
    }

    @Cuando("^hago clic en un producto aleatorio$")
    public void hagoClicEnUnProductoAleatorio() {

    }

    @Cuando("^revisa el boton de agregar al carrito$")
    public void revisaElBotonDeAgregarAlCarrito() {

    }

    @Entonces("^Regreso a la pagina principal$")
    public void regresoALaPaginaPrincipal() {

    }
}
