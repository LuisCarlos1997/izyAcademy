package tasks;

import interactions.Time;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterfaces.CategoriaUser;

public class CategoriaTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(CategoriaUser.BTN_HAMBURGUER));
        actor.attemptsTo(Click.on(CategoriaUser.BTN_POSTS));
        Time.sleep(2000);
        actor.attemptsTo(Click.on(CategoriaUser.BTN_ACCION_REALIZAR));
        Time.sleep(2000);
        actor.attemptsTo(Click.on(CategoriaUser.BTN_CREATE_CATEGORY));
        Time.sleep(2000);
        actor.attemptsTo(Enter.keyValues("Luis Carlos Valencia").into(CategoriaUser.TXT_NAME_CATEGORY));
        Time.sleep(2000);
        actor.attemptsTo(Enter.keyValues("Es una prueba automatizada con screenplay").into(CategoriaUser.TXT_DESCRIPTION_CATEGORY));
        Time.sleep(2000);
        actor.attemptsTo(Hit.the(Keys.ENTER).into(CategoriaUser.BTN_CREAR));
        Time.sleep(5000);

    }
    public static CategoriaTask categoriaTask(){
        return Tasks.instrumented(CategoriaTask.class);
    }
}
