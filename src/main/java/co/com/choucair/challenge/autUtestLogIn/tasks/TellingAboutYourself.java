package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSignUpYourself;
import net.serenitybdd.screenplay.Actor;
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
        actor.attemptsTo(Click.on(UTestSignUpYourself.JOIN_TODAY_BUTTON),
                Enter.theValue("Yair Alexander").into(UTestSignUpYourself.INPUT_FIRST_NAME),
                Enter.theValue("Tobar Caro").into(UTestSignUpYourself.INPUT_LAST_NAME),
                Enter.theValue("yatobarc@udistrital.edu.co").into(UTestSignUpYourself.INPUT_EMAIL),
                Click.on(UTestSignUpYourself.INPUT_BIRTHMONTH),
                Click.on(UTestSignUpYourself.INPUT_BIRTHDAY),
                Click.on(UTestSignUpYourself.INPUT_BIRTHYEAR),
                Click.on(UTestSignUpYourself.LOCATION_BUTTON)
        );

    }
}
