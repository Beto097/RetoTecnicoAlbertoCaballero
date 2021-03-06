package co.com.choucair.certification.RetoTecnico.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class UtestPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("button to join the Utest team").
            located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
}
