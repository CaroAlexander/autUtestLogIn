package co.com.choucair.challenge.autUtestLogIn.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class UTestSignUpYourself extends PageObject {
    public static final Target JOIN_TODAY_BUTTON = Target.the("button that shows us the form to Sing in")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    public static final Target INPUT_FIRST_NAME =Target.the("Where do we write the first user name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME =Target.the("Where do we write the last user name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL =Target.the("Where do we write the user  email")
            .located(By.id("email"));
    public static final Target INPUT_BIRTHMONTH = Target.the("Where do we write the user  birthMonth")
            .located(By.xpath("//option[@label='March']"));
    public static final Target INPUT_BIRTHDAY =Target.the("Where do we write the user birthDay")
            .located(By.xpath("//option[@label='12']"));
    public static final Target INPUT_BIRTHYEAR =Target.the("Where do we write the user birthYear")
            .located(By.xpath("//option[@label='1996']"));
    public static final Target INPUT_LANGUAGES =Target.the("Where do we write the user  languages")
            .located(By.className("ui-select-search input-xs ng-pristine ng-valid ng-empty ng-touched"));
    public static final Target LOCATION_BUTTON =Target.the("button to go to location user info(step2)")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue')]"));
}
