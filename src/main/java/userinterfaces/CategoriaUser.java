package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CategoriaUser {
    public static final Target BTN_HAMBURGUER = Target.the("Dar clic en el menu hamburguesa").locatedBy("//*[@id='toogle_menu']");

    public static final Target BTN_POSTS = Target.the("Dar clic en el boton posts").locatedBy("//*[@href='http://izyacademy.com:8000/post']");
    public static final Target BTN_ACCION_REALIZAR = Target.the("Dar clic en la lista desplegable que accion deseas realizar").locatedBy("//*[@class=\"accordion-header\"]");
    public static final Target BTN_CREATE_CATEGORY = Target.the("Dar clic en crear categoria").locatedBy("//*[@id='effect-button']");
    public static final Target TXT_NAME_CATEGORY = Target.the("Escribir el nombre de la categoria").locatedBy("//*[@name='CategorieName']");
    public static final Target TXT_DESCRIPTION_CATEGORY = Target.the("Escribir la descripcion de la categoria").locatedBy("//*[@name='descriptionCategory']");
    public static final Target BTN_CREAR = Target.the("Dar clic crear").locatedBy("//*[@id=\"effect-button\"]");
    public static final Target TXT_ACCESION = Target.the("Nombre de el creador").locatedBy("//*[(text()='Luis Carlos Valencia ')]");

}
