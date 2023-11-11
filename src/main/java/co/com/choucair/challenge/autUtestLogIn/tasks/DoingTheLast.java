package co.com.choucair.challenge.autUtestLogIn.tasks;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSignLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class DoingTheLast implements Task {

    public static DoingTheLast OnTheLastStep() { return Tasks.instrumented(DoingTheLast.class); }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of("HiChoucairISucceed2023").into(UTestSignLastStep.PASSWORD),
                SendKeys.of("HiChoucairISucceed2023").into(UTestSignLastStep.CONFIRMPASSWORD),
                Click.on(UTestSignLastStep.CHECKMARKTERMOFUSE),
                Click.on(UTestSignLastStep.CHECKMARKPRIVACY),
                Click.on(UTestSignLastStep.LADDABTN)

        );

    }
}
