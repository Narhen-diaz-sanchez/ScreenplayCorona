package co.corona.interactions;

import co.corona.globalVar.Global;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;

import static co.corona.userInterface.CoronaPrincipalUI.LBL_NOMBRECUARTOPRODUCTO;

public class SeleccionarCuartoProducto implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        Global.Check = LBL_NOMBRECUARTOPRODUCTO.resolveFor(actor).getText();
        LBL_NOMBRECUARTOPRODUCTO.resolveFor(actor).click();

    }

    public static Performable on (){
        return Instrumented.instanceOf(SeleccionarCuartoProducto.class).withProperties();
    }
}
