package co.corona.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CoronaPrincipalUI {
    public static final Target LBL_NOMBRESPRODUCTOS = Target.the("Nombres de productos en pagina principal")
            .locatedBy("//a[@class='name']");
}
