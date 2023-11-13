package co.com.choucair.challenge.autUtestLogIn.stepdefinitions;

import co.com.choucair.challenge.autUtestLogIn.model.AcademyChoucairData;
import co.com.choucair.challenge.autUtestLogIn.questions.LoginQuestions;
import co.com.choucair.challenge.autUtestLogIn.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class SignUpUtestStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());}

    @Given("^that Tester (.*) is on the Utest homepage$")
    public void thatAlexWantsToLogInToTheJoinTodaySectionOnTheUtestComPage(String actor) throws Exception {
        OnStage.theActorCalled(actor).wasAbleTo(OpenUp.thePage());
    }

    @When("^he successfully completes the whole sign up process$")
    public void heEnterIntoTheJoinTodaySectionOnTheUtestComPage(List<AcademyChoucairData> academyChoucairData) throws InterruptedException {
        OnStage.theActorInTheSpotlight().
                attemptsTo(
                        (TellingAboutYourself.OnTheStep1(
                                academyChoucairData.get(0).getStrFirstName(),
                                academyChoucairData.get(0).getStrLastName(),
                                academyChoucairData.get(0).getStrEmail()
                        )),
                        (AddingYourAddress.OnTheStep2(
                                academyChoucairData.get(0).getStrCity(),
                                academyChoucairData.get(0).getStrZipCode()
                        )),
                        (TellingAboutYourDevices.OnTheStep3()),
                        (DoingTheLast.OnTheLastStep(
                                academyChoucairData.get(0).getStrPassword()
                        ))
                );
    }

    @Then("^the welcome message is displayed out$")
    public void heFillsOutTheForm(List<AcademyChoucairData> academyChoucairData) throws Exception {

        String SUB_TITLE = "Welcome to the world's largest community of freelance software testers!";

        OnStage.theActorInTheSpotlight().
                should(GivenWhenThen.
                        seeThat(LoginQuestions.toThe(SUB_TITLE))
                );
    }
}
