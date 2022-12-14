package co.corona.interactions;

import co.corona.globalVar.Global;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;

import static co.corona.userInterface.CoronaPrincipalUI.LBL_NOMBRESPRODUCTOS;


public class SeleccionarIndice implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List< WebElementFacade> ListProducts = LBL_NOMBRESPRODUCTOS.resolveAllFor(actor);
        Global.Check = ListProducts.get(3).getText();
        ListProducts.get(3).click();


    }

    public static Performable on (){
        return Instrumented.instanceOf(SeleccionarIndice.class).withProperties();
    }

}
