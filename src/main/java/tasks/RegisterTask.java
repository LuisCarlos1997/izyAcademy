package tasks;

import interactions.Time;
import models.RegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.RegisterUser;
import utils.Utilidades;


public class RegisterTask implements Task {

    RegisterModel registerModel;

    public RegisterTask(RegisterModel registerModel) {
        this.registerModel = registerModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(RegisterUser.BTN_HAMBURGUER));
        actor.attemptsTo(Click.on(RegisterUser.BTN_REGISTER_UNE));
        //Registro de usuario
        actor.attemptsTo(Enter.keyValues(registerModel.getName()).into(RegisterUser.TXT_NAME));
        Time.sleep(2000);
        actor.attemptsTo(Enter.keyValues(registerModel.getUsername()).into(RegisterUser.TXT_USERNAME));
        Time.sleep(2000);
        actor.attemptsTo(SelectFromOptions.byValue(Utilidades.RESIDENCIAS).from(RegisterUser.COUNTRY)); // para seleccionar un texto que este en una lista o un arreglo
        Time.sleep(2000);
        actor.attemptsTo(Enter.keyValues(registerModel.getCity()).into(RegisterUser.TXT_CITY));

        actor.attemptsTo(Enter.keyValues(registerModel.getNumeroid()).into(RegisterUser.TXT_NUMID));

        actor.attemptsTo(Enter.keyValues(registerModel.getPhone()).into(RegisterUser.TXT_PHONE));

        actor.attemptsTo(Enter.keyValues(registerModel.getEmail()).into(RegisterUser.TXT_EMAIL));

        actor.attemptsTo(Enter.keyValues(registerModel.getPassword()).into(RegisterUser.TXT_PASSWORD));

        actor.attemptsTo(Enter.keyValues(registerModel.getVerify_password()).into(RegisterUser.TXT_VERIFY_PASSWORD));

        actor.attemptsTo(Click.on(RegisterUser.BTN_REGISTER));
      ;
    }

    public static RegisterTask Registrarse(RegisterModel registerModel) {
        return Tasks.instrumented(RegisterTask.class, registerModel);
    }
}
