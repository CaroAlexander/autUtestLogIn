package co.com.choucair.challenge.autUtestLogIn.stepdefinitions;

import co.com.choucair.challenge.autUtestLogIn.tasks.OpenUp;
import co.com.choucair.challenge.autUtestLogIn.tasks.TellingAboutYourDevices;
import co.com.choucair.challenge.autUtestLogIn.tasks.TellingAboutYourself;
import co.com.choucair.challenge.autUtestLogIn.tasks.AddingYourAddress;
//import co.com.choucair.challenge.autUtestLogIn.tasks.Singin3;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class LoginUtestStepDefinitions {

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());}

    @Given("^that Alex wants to log in to the Join Today section on the Utest page$")
    public void thatAlexWantsToLogInToTheJoinTodaySectionOnTheUtestComPage() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thePage());

    }


    @When("^he enter into the Join Today section on the Utest page$")
    public void heEnterIntoTheJoinTodaySectionOnTheUtestComPage() {
        OnStage.theActorInTheSpotlight().attemptsTo((TellingAboutYourself.OnThePage()),
                (AddingYourAddress.OnThePage2()), (TellingAboutYourDevices.OnThePage3()));
//withCurrentActor
    }

    @Then("^He fills out the form$")
    public void heFillsOutTheForm() {

    }


}
