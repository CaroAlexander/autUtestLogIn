package co.com.choucair.challenge.autUtestLogIn.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
//import java.lang.annotation.Target;

public class UTestSinginStep3 extends PageObject {

    public static final Target INPUT_OSId = Target.the("Where do we write the computer OS")//name="osId"
            .located(By.name("osId"));
    public static final Target INPUT_OSVersionID = Target.the("Where do we write the computer OS Version ID")//name="osVersionId"
            .located(By.name("osVersionId"));
    public static final Target INPUT_Langueage = Target.the("Where do we write the computer language")
            .located(By.name("osLanguageId"));
    public static final Target INPUT_PHONE = Target.the("Where do we write the celphone brand")
            .located(By.name("handsetMakerId"));

}

