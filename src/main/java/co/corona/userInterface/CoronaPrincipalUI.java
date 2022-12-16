package co.corona.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class CoronaPrincipalUI {
    public static final Target LBL_NOMBRESPRODUCTOS = Target.the("Nombres de productos en pagina principal")
            .locatedBy("//a[@class='name']");

    public static final Target LBL_UNICOPAGINAPRINCIPAL = Target.the("Elemento unico en la pagina principal")
            .locatedBy("//h3[contains(text(),'Productos Destacados')]");

    public static final Target IMG_LOGO = Target.the("Logo en la pagina principal")
            .locatedBy("//img[@title='Corona']");

    public static final Target LBL_NOMBRECUARTOPRODUCTO = Target.the("Nombre del cuarto producto en pagina principal")
            .locatedBy("(//a[@class='name'])[4]");
}
