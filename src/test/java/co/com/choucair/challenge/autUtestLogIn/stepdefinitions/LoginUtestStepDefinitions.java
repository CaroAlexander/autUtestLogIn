package co.com.choucair.challenge.autUtestLogIn.stepdefinitions;

import co.com.choucair.challenge.autUtestLogIn.tasks.*;
//import co.com.choucair.challenge.autUtestLogIn.tasks.Singin3;
import co.com.choucair.challenge.autUtestLogIn.userinterface.UTestSingLastStep;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginUtestStepDefinitions {

/*
    WebDriver driver;
    String TIPO_DRIVER = "webdriver.chrome.driver";
    String PATH_DRIVER = "./src/test/resources/driver/chromedriver.exe";
*/

    @Before
    public void setStage (){ OnStage.setTheStage(new OnlineCast());}

    /*
    public void setUP()
    {
        System.setProperty(TIPO_DRIVER,PATH_DRIVER);
        driver = new ChromeDriver();
    }
*/

    @Given("^that Alex wants to log in to the Join Today section on the Utest page$")
    public void thatAlexWantsToLogInToTheJoinTodaySectionOnTheUtestComPage() {
        OnStage.theActorCalled("Alex").wasAbleTo(OpenUp.thePage());

    }


    @When("^he enter into the Join Today section on the Utest page$")
    public void heEnterIntoTheJoinTodaySectionOnTheUtestComPage() throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo((TellingAboutYourself.OnTheStep1()),
                (AddingYourAddress.OnTheStep2()));
        OnStage.theActorInTheSpotlight().attemptsTo((TellingAboutYourDevices.OnTheStep3()),(DoingTheLast.OnTheLastStep()));
//withCurrentActor

/*
        WebElement INPUT_MOBILEBRNAD = driver.findElement(By.xpath("//*[@id='mobile-device']/div[1]/div[2]/div/input[1]"));
        INPUT_MOBILEBRNAD.sendKeys("Xiaomi");
        //Thread.sleep(3000);
  */
    }

    @Then("^He fills out the form$")
    public void heFillsOutTheForm() {

    }


}
