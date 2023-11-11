package co.com.choucair.challenge.autUtestLogIn.questions;

import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSignLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class LoginQuestions implements Question<Boolean> {
    private String question;

    public LoginQuestions(String question) {
        this.question = question;
    }
    public static LoginQuestions toThe(String question) {

        return new LoginQuestions(question);
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String WELCOME_MESSAGE = Text.of(UTestSignLastStep.WELCOME_MESSAGE).viewedBy(actor).asString();
        if (question.equals(WELCOME_MESSAGE)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
