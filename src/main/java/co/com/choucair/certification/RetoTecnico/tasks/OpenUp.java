package co.com.choucair.certification.RetoTecnico.tasks;

import co.com.choucair.certification.RetoTecnico.userinterface.UtestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private UtestPage UtestPage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(UtestPage),
                Click.on(UtestPage.JOIN_BUTTON));
    }
}
