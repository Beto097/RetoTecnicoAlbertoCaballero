package co.com.choucair.certification.RetoTecnico.stepdefinitions;

import co.com.choucair.certification.RetoTecnico.model.UtestData;
import co.com.choucair.certification.RetoTecnico.questions.Answer;
import co.com.choucair.certification.RetoTecnico.tasks.Complete;
import co.com.choucair.certification.RetoTecnico.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestRegisterStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Robert wants to join the Utest community$")
    public void thanRobertWantsToJoinTheUtestCommunity() {
        OnStage.theActorCalled("Robert").wasAbleTo(OpenUp.thePage());
    }

    @When("^he complete the registration process$")
    public void heCompleteTheRegistrationProcess(List<UtestData> UtestData) {
        OnStage.theActorInTheSpotlight().attemptsTo(Complete.the(UtestData.get(0).getStrName(),UtestData.get(0).getStrLastName(),
                UtestData.get(0).getStrEmail(),UtestData.get(0).getStrLangSpoke(),UtestData.get(0).getStrCity(),UtestData.get(0).getStrZip(),
                UtestData.get(0).getStrCountry(),UtestData.get(0).getStrPassword()));
    }

    @Then("^he finally register on Utest Community$")
    public void heFinallyRegisterOnUtestCommunity(List<UtestData> UtestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(UtestData.get(0).getStrWelcome())));
    }
}
