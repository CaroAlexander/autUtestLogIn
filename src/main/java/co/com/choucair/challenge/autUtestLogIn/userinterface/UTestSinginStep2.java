package co.com.choucair.challenge.autUtestLogIn.userinterface;
import net.serenitybdd.screenplay.targets.Target;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

//class="form-group address col-xs-12 col-sm-12 col-md-12 col-lg-12"
public class UTestSinginStep2 extends PageObject {
    public static final Target INPUT_CITY = Target.the("Where do we write the user city")
            .located(By.name("city"));
    public static final Target INPUT_ZIPCODE = Target.the("Where do we write the user city")
            .located(By.id("zip"));
    public static final Target Devices_BUTTON = Target.the("button to go to Devices user info")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));
}