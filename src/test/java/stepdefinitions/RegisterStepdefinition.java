package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.RegisterModel;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.RegisterTask;
import utils.Utilidades;

import java.util.List;

public class RegisterStepdefinition {


    @Managed
    private WebDriver browserdriver;


    @Before
    public void Open(){
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("Luis Carlos");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(browserdriver));
    }
    @Given("^Luis opens the page$")
    public void luisOpensThePage() {
       OnStage.theActorInTheSpotlight().wasAbleTo(Open.url(Utilidades.URL));
    }

    @When("^I write in the format to register$")
    public void iWriteInTheFormatToRegister(List<RegisterModel>registerModelList) {
        RegisterModel registerModel;
        registerModel = registerModelList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterTask.Registrarse(registerModel));

    }

    @Then("^I successfully registered on the izy page$")
    public void iSuccessfullyRegisteredOnTheIzyPage() {

    }

    @After
    public void close(){
        browserdriver.close();
    }

}
