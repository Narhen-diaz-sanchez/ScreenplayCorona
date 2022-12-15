package co.corona.questions;

import co.corona.userInterface.CoronaProductoUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionBtnCarrito implements Question {

    @Override
    public Boolean answeredBy(Actor actor){
        return CoronaProductoUI.BTN_AGREGARALCARRITO.resolveFor(actor).isVisible();
    }



    public static Question ValidacionBtnAgregarAlCarrito(){
        return new ValidacionBtnCarrito();
    }
}
