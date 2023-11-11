package co.com.choucair.challenge.autUtestLogIn.tasks;

import co.com.choucair.challenge.autUtestLogIn.interactions.TypeArrowDown;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSignUpAddress;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

public class AddingYourAddress implements Task {
    public static AddingYourAddress OnTheStep2(){
        return Tasks.instrumented(AddingYourAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Bogot").into(UTestSignUpAddress.INPUT_CITY)
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                TypeArrowDown.OnTheStep2(),
                Enter.theValue(Keys.ENTER).into(UTestSignUpAddress.INPUT_CITY),
                Enter.theValue("111041").into(UTestSignUpAddress.INPUT_ZIPCODE),
                Click.on(UTestSignUpAddress.Devices_BUTTON));

    }
}
