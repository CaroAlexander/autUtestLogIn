package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSinginYourself;
//import cucumber.api.java.af.En;
//import cucumber.api.java.es.E;
import net.serenitybdd.screenplay.Actor;
//mport net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TellingAboutYourself implements Task {
    public static TellingAboutYourself OnTheStep1() {
       return Tasks.instrumented(TellingAboutYourself.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestSinginYourself.JOIN_TODAY_BUTTON),
                Enter.theValue("Honey").into(UTestSinginYourself.INPUT_FIRST_NAME),
                Enter.theValue("Killer").into(UTestSinginYourself.INPUT_LAST_NAME),
                Enter.theValue("honey.killer69@gmail.com").into(UTestSinginYourself.INPUT_EMAIL),
                Click.on(UTestSinginYourself.INPUT_BIRTHMONTH),
                Click.on(UTestSinginYourself.INPUT_BIRTHDAY),
                Click.on(UTestSinginYourself.INPUT_BIRTHYEAR),
                //Enter.theValue("Spanish").into(UTestSinginPage.INPUT_LANGUAGES),
                Click.on(UTestSinginYourself.LOCATION_BUTTON)
        );

    }
}
