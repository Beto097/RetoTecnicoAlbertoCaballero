package co.com.choucair.certification.RetoTecnico.questions;

import co.com.choucair.certification.RetoTecnico.userinterface.WelcomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String strWelcome;

    public Answer(String strWelcome) {
        this.strWelcome = strWelcome;
    }


    public static Answer toThe(String strWelcome) {
        return new Answer(strWelcome);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String WelcomeMessage = Text.of(WelcomePage.WELCOME_TITLE).viewedBy(actor).asString();

        if (strWelcome.equals(WelcomeMessage)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
