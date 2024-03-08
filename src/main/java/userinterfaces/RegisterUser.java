package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterUser {



    public static final Target BTN_HAMBURGUER = Target.the("Dar clic en el menu hamburguesa").locatedBy("//*[@id='toogle_menu']");
    public static final Target BTN_REGISTER_UNE= Target.the("Dar clic en registrarse").locatedBy("//*[@id='Register']");
    public static final Target TXT_NAME = Target.the("Escribir el nombre").locatedBy("(//*[@id='exampleInputEmail1'])[1]");
    public static final Target TXT_USERNAME = Target.the("Escribir el usuario").locatedBy("//*[@name='username']");
    public static final Target COUNTRY = Target.the("Escribir el lugar de residencia").locatedBy("//*[@name='pais']");
    public static final Target TXT_NUMID = Target.the("Escribir el documento de identidad").locatedBy("(//*[@id='exampleInputEmail1']) [5]");
    public static final Target TXT_PHONE = Target.the("Escribir el telefono").locatedBy("(//*[@id='exampleInputEmail1'])[6]");
    public static final Target TXT_EMAIL = Target.the("Escribir el correo").locatedBy("//*[@id='email']");
    public static final Target TXT_PASSWORD = Target.the("Escribir una contraseña").locatedBy("//*[@id='password']");
    public static final Target TXT_VERIFY_PASSWORD = Target.the("validar contraseña").locatedBy("//*[@id='password-confirm']");
    public static final Target TXT_CITY = Target.the("Escribir la ciudad de origen").locatedBy("//*[@name='city']");
    public static final Target BTN_REGISTER = Target.the("Dar clic sobre el boton registrar").locatedBy("//*[@id='effect-button']");
}
