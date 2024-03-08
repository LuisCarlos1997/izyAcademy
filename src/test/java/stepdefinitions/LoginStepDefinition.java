package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import models.LoginModel;
import net.serenitybdd.screenplay.actors.OnStage;
import tasks.LoginTask;

import java.util.List;

public class LoginStepDefinition {

    @When("^I log in to the izyacademy page with the following credentials$")
    public void iLogInToTheIzyacademyPageWithTheFollowingCredentials(List<LoginModel>loginModelList) {
        LoginModel loginModel;
        loginModel = loginModelList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(LoginTask.loginTask(loginModel));
    }

    @Then("^I correctly enter the main page of the izy$")
    public void iCorrectlyEnterTheMainPageOfTheIzy() {

    }

}
