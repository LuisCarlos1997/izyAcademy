package stepdefinitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.CategoriaAsercion;
import tasks.CategoriaTask;

public class CategoriasStepDefinition {

    @When("^I click on the post menu and fill out the fields$")
    public void iClickOnThePostMenuAndFillOutTheFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(CategoriaTask.categoriaTask());
    }

    @Then("^I successfully completed the creation of the category$")
    public void iSuccessfullyCompletedTheCreationOfTheCategory() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CategoriaAsercion.categoriaAsercion()));
    }
}
