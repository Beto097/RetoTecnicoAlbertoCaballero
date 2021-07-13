package co.com.choucair.certification.RetoTecnico.tasks;

import co.com.choucair.certification.RetoTecnico.userinterface.RegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Complete implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strLangSpoke;
    private String strCity;
    private String strZip;
    private String strCountry;
    private String strPassword;

    public Complete(String strName, String strLastName, String strEmail, String strLangSpoke, String strCity, String strZip, String strCountry,
                     String strPassword) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strLangSpoke = strLangSpoke;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strCountry = strCountry;
        this.strName = strName;
        this.strPassword = strPassword;
    }


    public static Complete the(String strName, String strLastName,
                               String strEmail, String strLangSpoke,
                               String strCity, String strZip, String strCountry, String strPassword) {
        return Tasks.instrumented(Complete.class,strName,strLastName,strEmail,strLangSpoke,strCity,strZip,strCountry,strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(strName).into(RegisterPage.FIRSTNAME_BOX),
                Enter.theValue(strLastName).into(RegisterPage.LASTNAME_BOX),
                Enter.theValue(strEmail).into(RegisterPage.EMAIL_BOX),
                Click.on(RegisterPage.MONTH_VALUE),
                Click.on(RegisterPage.DAY_VALUE),
                Click.on(RegisterPage.YEAR_VALUE),
                Enter.theValue(strLangSpoke).into(RegisterPage.LANGUAJE_SPOKEN),
                Hit.the(Keys.ENTER).into(RegisterPage.LANGUAJE_SPOKEN),
                Click.on(RegisterPage.NEXT_BUTTON_ADDRESS),
                Click.on(RegisterPage.CITY_BOX),
                Enter.theValue(strCity).into(RegisterPage.CITY_BOX),
                Hit.the(Keys.ARROW_DOWN).into(RegisterPage.CITY_BOX),
                Hit.the(Keys.ENTER).into(RegisterPage.CITY_BOX),
                Enter.theValue(strZip).into(RegisterPage.ZIP_CODE),
                Click.on(RegisterPage.COUNTRY_BOX),
                Enter.theValue(strCountry).into(RegisterPage.COUNTRY_BOX_TEXT),
                Hit.the(Keys.ARROW_DOWN).into(RegisterPage.COUNTRY_BOX_TEXT),
                Hit.the(Keys.ENTER).into(RegisterPage.COUNTRY_BOX_TEXT),
                Click.on(RegisterPage.NEXT_BUTTON_DEVICES),
                Click.on(RegisterPage.OS_COMPUTER),
                Enter.theValue("Windows").into(RegisterPage.OS_COMPUTER_BOX),
                Hit.the(Keys.ENTER).into(RegisterPage.OS_COMPUTER_BOX),
                Click.on(RegisterPage.OS_VERSION),
                Enter.theValue("Windows 10").into(RegisterPage.OS_VERSION_BOX),
                Hit.the(Keys.ENTER).into(RegisterPage.OS_VERSION_BOX),
                Click.on(RegisterPage.OS_LANGUAGE),
                Enter.theValue("Spanish").into(RegisterPage.OS_LANGUAGE_BOX),
                Hit.the(Keys.ENTER).into(RegisterPage.OS_LANGUAGE_BOX),
                Click.on(RegisterPage.MOBILE_BRAND),
                Enter.theValue("Apple").into(RegisterPage.MOBILE_BRAND_BOX),
                Hit.the(Keys.ENTER).into(RegisterPage.MOBILE_BRAND_BOX),
                Click.on(RegisterPage.MOBILE_MODEL),
                Enter.theValue("iPhone").into(RegisterPage.MOBILE_MODEL_BOX),
                Hit.the(Keys.ENTER).into(RegisterPage.MOBILE_MODEL_BOX),
                Click.on(RegisterPage.MOBILE_OS),
                Enter.theValue("iOS 14.2 ").into(RegisterPage.MOBILE_OS_BOX),
                Hit.the(Keys.ENTER).into(RegisterPage.MOBILE_OS_BOX),
                Click.on(RegisterPage.NEXT_BUTTON_LAST),
                Enter.theValue(strPassword).into(RegisterPage.PASSWORD),
                Enter.theValue(strPassword).into(RegisterPage.CONFIRM_PASSWORD),
                Click.on(RegisterPage.ACCEPT_UTEST_TERMS),
                Click.on(RegisterPage.ACCEPT_UTEST_PRIVACY_POLICY),
                Click.on(RegisterPage.COMPLETE_REGISTER));
    }
}
