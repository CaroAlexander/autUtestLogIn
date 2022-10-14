package co.com.choucair.challenge.autUtestLogIn.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
//import java.lang.annotation.Target;

public class UTestSinginDevices extends PageObject {

    public static final Target INPUT_LANGUEAGE= Target.the("Where do we write the Device Language")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[3]");
    public static final Target INPUT_ENGLISH = Target.the("Alex choose English")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[11]");
    public static final Target INPUT_DEVICE = Target.the("Where do we write the mobile device brand")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[4]");
    public static final Target INPUT_XIAOMI = Target.the("Alex choose Xiaomi")
            .locatedBy("(//span[@class=\"ui-select-choices-row-inner\"])[88]");
    public static final Target INPUT_MODEL = Target.the("Where do we write the mobile model")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[5]");
    public static final Target INPUT_Redmi = Target.the("Alex choose Redmi_note_10_PRO")
            .locatedBy("(//div[@class=\"ui-select-choices-row\"])[128]");
    public static final Target INPUT_DEVICE_OS = Target.the("Where do we write the mobile device OS")
            .locatedBy("(//span[@class=\"btn btn-default form-control ui-select-toggle\"])[6]");
    public static final Target INPUT_ANDROID = Target.the("Alex choose Android 12")
            .locatedBy("(//div[@class=\"ui-select-choices-row\"])[1]");
    public static final Target LASTSTEP_BUTTON = Target.the("button to go to the las Step")
            .locatedBy("//a[@class=\"btn btn-blue pull-right\"]");
}

