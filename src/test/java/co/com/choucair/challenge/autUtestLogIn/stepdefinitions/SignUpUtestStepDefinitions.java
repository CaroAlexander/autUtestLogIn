package co.com.choucair.challenge.autUtestLogIn.stepdefinitions;

import co.com.choucair.challenge.autUtestLogIn.questions.LoginQuestions;
import co.com.choucair.challenge.autUtestLogIn.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class SignUpUtestStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());}

    @Given("^that Alex is on the Utest homepage$")
    public void thatAlexWantsToLogInToTheJoinTodaySectionOnTheUtestComPage() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thePage());
    }

    @When("^he successfully completes the whole sign up process$")
    public void heEnterIntoTheJoinTodaySectionOnTheUtestComPage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().
                attemptsTo(
                        (TellingAboutYourself.OnTheStep1()),
                        (AddingYourAddress.OnTheStep2()),
                        (TellingAboutYourDevices.OnTheStep3()),
                        (DoingTheLast.OnTheLastStep())
                );
    }

    @Then("^the welcome message is displayed out$")
    public void heFillsOutTheForm() {

        String SUB_TITLE = "Welcome to the world's largest community of freelance software testers!";

        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.
                        seeThat(LoginQuestions.toThe(SUB_TITLE))
                );
    }
}
