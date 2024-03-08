package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginUser {
    public static final Target BTN_HAMBURGUER = Target.the("Dar clic en el menu hamburguesa").locatedBy("//*[@id='toogle_menu']");
    public static final Target BTN_LOGINE= Target.the("Dar clic en Login").locatedBy("//*[@id='Login']");

    public static final Target TXT_EMAIL = Target.the("Escribir el correo").locatedBy("//*[@id='exampleInputEmail1']");
    public static final Target TXT_PASSWORD = Target.the("Escribir una contraseña").locatedBy("//*[@id='exampleInputPassword1']");
    public static final Target BTN_LOGIN = Target.the("Dar clic en el boton login").locatedBy("//*[@id='effect-button']");

}
