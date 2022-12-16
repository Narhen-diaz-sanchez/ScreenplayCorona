package co.corona.stepDefinitions;

import co.corona.globalVar.Global;
import co.corona.questions.ValidacionLogo;
import co.corona.tasks.VerificarProducto;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class VerificarProductoStepDefinition {



    @Cuando("^hago clic el cuarto producto$")
    public void hagoClicElCuartoProducto() {
        OnStage.theActorInTheSpotlight().attemptsTo(VerificarProducto.on());

    }

    @Entonces("^Reviso que el producto sea el mismo$")
    public void revisoQueElProductoSeaElMismo() {
        Assert.assertEquals(Global.Check,Global.CheckTitle);
    }

}
