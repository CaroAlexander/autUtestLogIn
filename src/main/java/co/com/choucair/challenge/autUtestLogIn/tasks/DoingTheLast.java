package co.com.choucair.challenge.autUtestLogIn.tasks;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSignLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class DoingTheLast implements Task {

    private final String password;

    public DoingTheLast(String password) {
        this.password = password;
    }

    public static DoingTheLast OnTheLastStep(String password) {
        return Tasks.instrumented(DoingTheLast.class, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                SendKeys.of(password).into(UTestSignLastStep.PASSWORD),
                SendKeys.of(password).into(UTestSignLastStep.CONFIRMPASSWORD),
                Click.on(UTestSignLastStep.CHECKMARKTERMOFUSE),
                Click.on(UTestSignLastStep.CHECKMARKPRIVACY),
                Click.on(UTestSignLastStep.LADDABTN)

        );

    }
}
