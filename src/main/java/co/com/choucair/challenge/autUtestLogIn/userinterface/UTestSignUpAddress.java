package co.com.choucair.challenge.autUtestLogIn.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class UTestSignUpAddress extends PageObject {
    public static final Target INPUT_CITY = Target.the("Where do we write the user city")
            .located(By.name("city"));
    public static final Target INPUT_ZIPCODE = Target.the("Where do we write the user city")
       .located(By.xpath("//*[@id=\"zip\"]"));

    public static final Target Devices_BUTTON = Target.the("button to go to Devices user info")
            .located(By.xpath("//a[contains(@class, 'btn btn-blue pull-right')]"));

    public static final Target BOGOTA_CITY = Target.the("Bogota city")
            .locatedBy("(//div[@class=\"pac-item pac-item-selected\"])");
}