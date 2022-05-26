package co.com.choucair.certification.openCart.stepdefinitions;

import co.com.choucair.certification.openCart.questions.CheckFilter;
import co.com.choucair.certification.openCart.questions.VerifyMessage;
import co.com.choucair.certification.openCart.tasks.*;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class StepDefinitionsInteractProducts {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("I am logged in as a DEMO user on the OpenCart Page")
    public void accessToTheOpenCartPage() {
        OnStage.theActorCalled("DemoUser").wasAbleTo(
                OpenUp.thePage(),
                InsertCredentials.requiredFields()
                );
    }

    @When("^I add a product to the catalog$")
    public void iAddAProductToTheCatalog() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InCatalog.selectProduct(),
                AddItem.newProduct()
        );
    }
    @When("^I modify a product to the catalog$")
    public void iModifyAProductToTheCatalog() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InCatalog.selectProduct(),
                EditItem.inListProduct()
        );
    }
    @When("^I use filter by Product Name (.*)$")
    public void iUseFilterByProductName(String item) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                InCatalog.selectProduct(),
                FilterItem.inFilterPanel(item)
        );
    }

    @Then("^I should see the warning message$")
    public void iShouldSeeTheWarningMessage() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyMessage.toThe()));
    }
    @Then("^i should see the filtered product (.*)$")
    public void iShouldSeeTheFilteredProduct(String item) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckFilter.toThe(item)));
    }

}
