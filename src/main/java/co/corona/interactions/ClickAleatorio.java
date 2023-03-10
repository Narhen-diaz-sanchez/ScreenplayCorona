package co.corona.interactions;


import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static co.corona.userInterface.CoronaPrincipalUI.LBL_NOMBRESPRODUCTOS;


public class ClickAleatorio implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        List< WebElementFacade> ListaDeProductos = LBL_NOMBRESPRODUCTOS.resolveAllFor(actor);
        Random random  = new Random();
        int randomNumber = random.nextInt(ListaDeProductos.size());
        ListaDeProductos.get(randomNumber).click();



    }
    public static Performable on(){

        return Instrumented.instanceOf(ClickAleatorio.class).withProperties();
    }
}
