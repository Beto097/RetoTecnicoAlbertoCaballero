package co.com.choucair.certification.RetoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class WelcomePage {
    public static final Target WELCOME_TITLE = Target.the("Message that shows a welcome for the new user").
            located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
}
