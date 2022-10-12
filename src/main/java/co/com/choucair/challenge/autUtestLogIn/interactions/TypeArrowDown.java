package co.com.choucair.challenge.autUtestLogIn.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class TypeArrowDown implements Interaction {

    public static TypeArrowDown OnThePage2(){
        return Tasks.instrumented(TypeArrowDown.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Actions action = new Actions(BrowseTheWeb.as(actor).getDriver());
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
    }
}
