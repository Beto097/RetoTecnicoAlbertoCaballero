package co.com.choucair.certification.RetoTecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterPage {


    public static final Target FIRSTNAME_BOX = Target.the("Where the user writes his firstname").
            located(By.id("firstName"));
    public static final Target LASTNAME_BOX = Target.the("Where the user writes his lastname").
            located(By.id("lastName"));
    public static final Target EMAIL_BOX = Target.the("Where the user writes his email address").
            located(By.id("email"));
    public static final Target MONTH_VALUE = Target.the("Where the user select his birth mont").
            located(By.xpath("//*[@id=\"birthMonth\"]/option[7]"));
    public static final Target DAY_VALUE = Target.the("Where the user writes his birth day").
            located(By.xpath("//*[@id=\"birthDay\"]/option[26]"));
    public static final Target YEAR_VALUE = Target.the("Where the user writes his birth year").
            located(By.xpath("//*[@value='number:1996']"));
    public static final Target LANGUAJE_SPOKEN = Target.the("Where the user writes if he knows more languages").
            located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target NEXT_BUTTON_ADDRESS = Target.the("To continue to the next step of registration").
            located(By.xpath("//a[@class='btn btn-blue']"));
    public static final Target CITY_BOX = Target.the("Where the user writes his city").
            located(By.id("city"));
    public static final Target ZIP_CODE = Target.the("Where the user writes his ZIP code").
            located(By.id("zip"));
    public static final Target COUNTRY_BOX = Target.the("Where the user writes his country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]"));
    public static final Target COUNTRY_BOX_TEXT = Target.the("Where the user writes his country").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT_BUTTON_DEVICES = Target.the("To continue to the next step of registration").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target OS_COMPUTER = Target.the("Where the user select the OS version of his computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target OS_COMPUTER_BOX = Target.the("Where the user select wich cumputer he use").
            located(By.xpath("//*[@id=\"web-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target OS_VERSION = Target.the("Where the user select the OS version of his computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target OS_VERSION_BOX = Target.the("Where the user select the OS version of his computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target OS_LANGUAGE = Target.the("Where the user select the language of the computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target OS_LANGUAGE_BOX = Target.the("Where the user select the language of the computer").
            located(By.xpath("//*[@id=\"web-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target MOBILE_BRAND = Target.the("Where the user select the brand of his phone").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]"));
    public static final Target MOBILE_BRAND_BOX = Target.the("Where the user select the brand of his phone").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target MOBILE_MODEL = Target.the("Where the user select the model of his phone").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]"));
    public static final Target MOBILE_MODEL_BOX = Target.the("Where the user select the model of his phone").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target MOBILE_OS = Target.the("Where the user select the OS of his phone").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]"));
    public static final Target MOBILE_OS_BOX = Target.the("Where the user select the OS of his phone").
            located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target NEXT_BUTTON_LAST = Target.the("To continue to the next step of registration").
            located(By.xpath("//a[@class='btn btn-blue pull-right']"));
    public static final Target PASSWORD = Target.the("Where the user writes the password to login to the page").
            located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Where the user confirm the password to login to the page").
            located(By.id("confirmPassword"));
    public static final Target ACCEPT_UTEST_TERMS = Target.the("Where the user accepts the Utest Terms and Code of Conduct").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target ACCEPT_UTEST_PRIVACY_POLICY = Target.the("Where the user accept the privacy y security policy").
            located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target COMPLETE_REGISTER = Target.the("To continue to the next step of registration").
            located(By.id("laddaBtn"));

}
