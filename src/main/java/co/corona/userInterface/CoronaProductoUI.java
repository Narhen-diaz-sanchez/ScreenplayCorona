package co.corona.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CoronaProductoUI {
    public static final Target LBL_NOMBREPRODUCTO = Target.the("Nombre producto en pagina del producto")
            .locatedBy("//h1[@class='name']");

    public static final Target BTN_AGREGARALCARRITO = Target.the("Agregar producto al carrito")
            .locatedBy("//button[@id='addToCartButton']");
}
