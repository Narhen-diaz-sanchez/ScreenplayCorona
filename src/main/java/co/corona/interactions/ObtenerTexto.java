package co.corona.interactions;

import co.corona.globalVar.Global;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import static co.corona.userInterface.CoronaProductoUI.LBL_NOMBREPRODUCTO;


public class ObtenerTexto implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {


        Global.CheckTitle = LBL_NOMBREPRODUCTO.resolveFor(actor).getText();


    }



    public static Performable on(){

        return Instrumented.instanceOf(ObtenerTexto.class).withProperties();
    }


}
