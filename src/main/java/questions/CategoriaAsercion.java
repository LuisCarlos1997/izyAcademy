package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.UIStateReaderBuilder;
import userinterfaces.CategoriaUser;

public class CategoriaAsercion implements Question<UIStateReaderBuilder<Text>> {
    @Override
    public UIStateReaderBuilder<Text> answeredBy(Actor actor) {
        return Text.of(CategoriaUser.TXT_ACCESION.resolveFor(actor).toString());

    }
    public static CategoriaAsercion categoriaAsercion(){
        return new CategoriaAsercion();
    }
}
