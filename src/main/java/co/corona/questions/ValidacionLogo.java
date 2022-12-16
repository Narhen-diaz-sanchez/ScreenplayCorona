package co.corona.questions;

import co.corona.userInterface.CoronaPrincipalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLogo implements Question {
    @Override
    public Boolean answeredBy(Actor actor){
        return CoronaPrincipalUI.IMG_LOGO.resolveFor(actor).isVisible();
    }
    public static Question ValidacionImgLogo(){
        return new ValidacionLogo();
    }
}
