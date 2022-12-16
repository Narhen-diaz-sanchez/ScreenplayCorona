package co.corona.tasks;

import co.corona.interactions.ObtenerTexto;
import co.corona.interactions.Recargar;
import co.corona.interactions.SeleccionarCuartoProducto;
import co.corona.questions.ValidacionLogo;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actors.OnStage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class VerificarProducto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Recargar.on()
        );

        OnStage.theActorInTheSpotlight().should(seeThat(
                "El actor puede ver", ValidacionLogo.ValidacionImgLogo(),
                Matchers.equalTo(true)));

        actor.attemptsTo(
                SeleccionarCuartoProducto.on(),
                ObtenerTexto.on()
        );

    }
    public static Performable on (){

        return Instrumented.instanceOf(VerificarProducto.class).withProperties();
    }
}
