package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSignUpYourself;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TellingAboutYourself implements Task {

    private final String strFirstName;
    private final String strLastName;
    private final String strEmail;

    public TellingAboutYourself(String strFirstName, String strLastName, String strEmail) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }

    public static TellingAboutYourself OnTheStep1(String strFirstName, String strLastName, String strEmail) {
       return Tasks.instrumented(TellingAboutYourself.class, strFirstName, strLastName, strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestSignUpYourself.JOIN_TODAY_BUTTON),
                Enter.theValue(strFirstName).into(UTestSignUpYourself.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UTestSignUpYourself.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UTestSignUpYourself.INPUT_EMAIL),
                Click.on(UTestSignUpYourself.INPUT_BIRTHMONTH),
                Click.on(UTestSignUpYourself.INPUT_BIRTHDAY),
                Click.on(UTestSignUpYourself.INPUT_BIRTHYEAR),
                Click.on(UTestSignUpYourself.LOCATION_BUTTON)
        );

    }
}
