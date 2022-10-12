package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSinginStep3;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class TellingAboutYourDevices implements Task {
    public static TellingAboutYourDevices OnThePage3() {
        return Tasks.instrumented(TellingAboutYourDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("Windows").into(UTestSinginStep3.INPUT_OSId)); //name="osId"

        actor.attemptsTo(Enter.theValue("10").into(UTestSinginStep3.INPUT_OSVersionID)); //name="osVersionId"

        actor.attemptsTo(Enter.theValue("GERMAN").into(UTestSinginStep3.INPUT_Langueage));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Enter.theValue(Keys.ENTER).into(UTestSinginStep3.INPUT_Langueage),
                (Enter.theValue("XIAOMI").into(UTestSinginStep3.INPUT_PHONE))

        );
    }
}