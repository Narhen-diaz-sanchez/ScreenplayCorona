package co.corona.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CoronaProductoUI {
    public static final Target LBL_NOMBREPRODUCTO = Target.the("Nombre producto en pagina del producto")
            .locatedBy("//a[@class='name']");
}
