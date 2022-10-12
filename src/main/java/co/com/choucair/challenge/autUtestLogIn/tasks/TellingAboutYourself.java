package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSinginStep1;
//import cucumber.api.java.af.En;
//import cucumber.api.java.es.E;
import net.serenitybdd.screenplay.Actor;
//mport net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TellingAboutYourself implements Task {
    public static TellingAboutYourself OnThePage() {
       return Tasks.instrumented(TellingAboutYourself.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSinginStep1.JOIN_TODAY_BUTTON),
                Enter.theValue("Honey").into(UTestSinginStep1.INPUT_FIRST_NAME),
                Enter.theValue("Killer").into(UTestSinginStep1.INPUT_LAST_NAME),
                Enter.theValue("honey.killer69@gmail.com").into(UTestSinginStep1.INPUT_EMAIL),
                Click.on(UTestSinginStep1.INPUT_BIRTHMONTH),
                Click.on(UTestSinginStep1.INPUT_BIRTHDAY),
                Click.on(UTestSinginStep1.INPUT_BIRTYEAR),
                //Enter.theValue("Spanish").into(UTestSinginPage.INPUT_LANGUAGES),
                Click.on(UTestSinginStep1.LOCATION_BUTTON)
        );

    }
}
