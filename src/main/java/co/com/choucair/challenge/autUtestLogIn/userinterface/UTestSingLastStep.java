package co.com.choucair.challenge.autUtestLogIn.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestSingLastStep extends PageObject {
    public static final Target PASSWORD = Target.the("Where do we write the Password")
            .located(By.id("password"));
    public static final Target CONFIRMPASSWORD = Target.the("Where do we confirm the Password")
            .located(By.id("confirmPassword"));
    public static final Target CHECKMARKTERMOFUSE = Target.the("Where do we accept the terms of use")
            .locatedBy("(//span[@class=\"checkmark signup-consent__checkbox error\"])[1]");
    public static final Target CHECKMARKPRIVACY = Target.the("Where do we accept the terms of privacy")
            .locatedBy("//span[@ng-class=\"{error: userForm.privacySetting.$error.required}\"]");
    public static final Target LADDABTN = Target.the("Where do we write the Password")
            .located(By.id("laddaBtn"));

}
