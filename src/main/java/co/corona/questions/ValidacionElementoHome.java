package co.corona.questions;

import co.corona.userInterface.CoronaPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionElementoHome implements Question{

    @Override
    public Boolean answeredBy(Actor actor){
        return CoronaPrincipalUI.LBL_UNICOPAGINAPRINCIPAL.resolveFor(actor).isVisible();
    }



    public static Question ValidacionLblUnicoHome(){
        return new ValidacionElementoHome();
    }
}
