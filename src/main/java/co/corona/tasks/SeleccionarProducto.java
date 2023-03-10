package co.corona.tasks;


import co.corona.interactions.ClickAleatorio;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class SeleccionarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(

                ClickAleatorio.on()

        );

    }
    public static Performable on (){

        return Instrumented.instanceOf(SeleccionarProducto.class).withProperties();
    }
}
