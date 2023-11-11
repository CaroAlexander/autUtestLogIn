package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSignUpDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class TellingAboutYourDevices implements Task {
    public static TellingAboutYourDevices OnTheStep3() {
        return Tasks.instrumented(TellingAboutYourDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UTestSignUpDevices.INPUT_LANGUEAGE),
                Click.on(UTestSignUpDevices.INPUT_ENGLISH),
                Click.on(UTestSignUpDevices.INPUT_DEVICE),
                Click.on(UTestSignUpDevices.INPUT_XIAOMI),
                Click.on(UTestSignUpDevices.INPUT_MODEL),
                Click.on(UTestSignUpDevices.INPUT_Redmi),
                Click.on(UTestSignUpDevices.INPUT_DEVICE_OS),
                Click.on(UTestSignUpDevices.INPUT_ANDROID),
                Click.on(UTestSignUpDevices.LASTSTEP_BUTTON)
        );
    }
}