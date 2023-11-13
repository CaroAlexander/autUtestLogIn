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

    private final String strCity;
    private final String strZipCode;

    public AddingYourAddress (String strCity, String strZipCode) {
        this.strCity = strCity;
        this.strZipCode = strZipCode;

    }

    public static AddingYourAddress OnTheStep2(String strCity, String strZipCode){
        return Tasks.instrumented(AddingYourAddress.class, strCity, strZipCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strCity).into(UTestSignUpAddress.INPUT_CITY)
        );

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                TypeArrowDown.OnTheStep2()
        );

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        actor.attemptsTo(
                Click.on(UTestSignUpAddress.BOGOTA_CITY),
                //Enter.theValue(Keys.ENTER).into(UTestSignUpAddress.INPUT_CITY),
                Enter.theValue(strZipCode).into(UTestSignUpAddress.INPUT_ZIPCODE),
                Click.on(UTestSignUpAddress.Devices_BUTTON));

    }
}