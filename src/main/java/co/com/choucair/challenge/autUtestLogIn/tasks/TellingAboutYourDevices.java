package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.interactions.TypeArrowDown;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSinginDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class TellingAboutYourDevices implements Task {
    public static TellingAboutYourDevices OnTheStep3() {
        return Tasks.instrumented(TellingAboutYourDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(UTestSinginDevices.INPUT_LANGUEAGE),
                Click.on(UTestSinginDevices.INPUT_ENGLISH),
                Click.on(UTestSinginDevices.INPUT_DEVICE),
                Click.on(UTestSinginDevices.INPUT_XIAOMI),
                Click.on(UTestSinginDevices.INPUT_MODEL),
                Click.on(UTestSinginDevices.INPUT_Redmi),
                Click.on(UTestSinginDevices.INPUT_DEVICE_OS),
                Click.on(UTestSinginDevices.INPUT_ANDROID),
                Click.on(UTestSinginDevices.LASTSTEP_BUTTON)
        );
/*
        actor.attemptsTo(Enter.theValue("Elementary OS").into(UTestSinginStep3.INPUT_OSId));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo((Hit.the(Keys.ARROW_DOWN).into(UTestSinginStep3.INPUT_OSId)),
                Hit.the(Keys.ENTER).into(UTestSinginStep3.INPUT_OSId));
*/

        //actor.attemptsTo(Enter.theValue("Linux").into(UTestSinginStep3.INPUT_OSId)); //name="osId"
/*
        actor.attemptsTo(Enter.theValue("10").into(UTestSinginStep3.INPUT_OSVersionID)); //name="osVersionId"

        actor.attemptsTo(Enter.theValue("GERMAN").into(UTestSinginStep3.INPUT_Langueage));

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Enter.theValue(Keys.ENTER).into(UTestSinginStep3.INPUT_Langueage),
                (Enter.theValue("XIAOMI").into(UTestSinginStep3.INPUT_PHONE))

)
 */

        /*
        actor.attemptsTo((Click.on(UTestSinginStep3.INPUT_PHONE)),(Enter.theValue("XIAOMI").into(UTestSinginStep3.INPUT_PHONE)));
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(Enter.theValue(Keys.ENTER).into(UTestSinginStep3.INPUT_PHONE));



//,(Enter.theValue("Xiaomi").into(UTestSinginStep3.INPUT_PHONE)),
        actor.attemptsTo(Click.on(UTestSinginDevices.INPUT_PHONE),
                Click.on(UTestSinginDevices.INPUT_PHONE),
                Click.on(UTestSinginDevices.INPUT_PHONE),
                //Enter.theValue("XIAOMI").into(UTestSinginStep3.INPUT_PHONE),
                TypeArrowDown.OnTheStep2(), Enter.theValue(Keys.ENTER).into(UTestSinginDevices.INPUT_PHONE));
                //(Hit.the(Keys.ARROW_DOWN).into(UTestSinginStep3.INPUT_PHONE)),
                //(Hit.the(Keys.ENTER).into(UTestSinginStep3.INPUT_PHONE)));

       // actor.attemptsTo(Click.on(UTestSinginStep3.INPUT_PHONE));

*/




    }
}