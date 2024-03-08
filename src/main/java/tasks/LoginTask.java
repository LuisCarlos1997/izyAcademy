package tasks;

import interactions.Time;
import models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginUser;

public class LoginTask implements Task {

    LoginModel loginModel;

    public LoginTask(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginUser.BTN_HAMBURGUER));
        actor.attemptsTo(Click.on(LoginUser.BTN_LOGINE));
        actor.attemptsTo(Enter.keyValues(loginModel.getEmail()).into(LoginUser.TXT_EMAIL));
        actor.attemptsTo(Enter.keyValues(loginModel.getPassword()).into(LoginUser.TXT_PASSWORD));
        Time.sleep(2000);
        actor.attemptsTo(Click.on(LoginUser.BTN_LOGIN));
        Time.sleep(2000);
    }
    public static LoginTask loginTask(LoginModel loginModel){
        return Tasks.instrumented(LoginTask.class, loginModel);

    }
}
