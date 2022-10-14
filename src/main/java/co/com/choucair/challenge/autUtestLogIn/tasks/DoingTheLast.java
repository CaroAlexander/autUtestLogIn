package co.com.choucair.challenge.autUtestLogIn.tasks;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSingLastStep;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSinginDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class DoingTheLast implements Task {

    public static DoingTheLast OnTheLastStep() { return Tasks.instrumented(DoingTheLast.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of("HolaChoucairLoLogre123").into(UTestSingLastStep.PASSWORD),
                SendKeys.of("HolaChoucairLoLogre123").into(UTestSingLastStep.CONFIRMPASSWORD),
                Click.on(UTestSingLastStep.CHECKMARKTERMOFUSE),
                Click.on(UTestSingLastStep.CHECKMARKPRIVACY),
                Click.on(UTestSingLastStep.LADDABTN)

        );

    }
}
