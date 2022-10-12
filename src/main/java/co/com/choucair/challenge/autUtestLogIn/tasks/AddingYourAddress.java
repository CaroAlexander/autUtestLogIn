package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.interactions.TypeArrowDown;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSinginStep2;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddingYourAddress implements Task {
    public static AddingYourAddress OnThePage2(){
        return Tasks.instrumented(AddingYourAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Bogota").into(UTestSinginStep2.INPUT_CITY)
        );

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(TypeArrowDown.OnThePage2(), Enter.theValue(Keys.ENTER).into(UTestSinginStep2.INPUT_CITY),
                Enter.theValue("111041").into(UTestSinginStep2.INPUT_ZIPCODE),Click.on(UTestSinginStep2.Devices_BUTTON)
        );
    }
}
