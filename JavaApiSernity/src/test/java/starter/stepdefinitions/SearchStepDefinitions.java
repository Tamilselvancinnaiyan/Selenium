package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Steps;
import org.hamcrest.Matchers;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.contains;

public class SearchStepDefinitions {

    @Steps
    public CarsAPI carsAPI;

    @When("he calls endpoint {string}")
    public void heCallsEndpoint(String arg0) {
        SerenityRest.given().get(arg0);
    }

    @Then("he sees the results displayed for Dogs")
    public void heSeesTheResultsDisplayedForApple() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Then("he sees the results displayed for gender")
    public void heSeesTheResultsDisplayedForMango() {
        restAssuredThat(response -> response.body("gender", Matchers.equalTo("female")));
    }
    
    @Then("he doesn not see the results")
    public void he_Doesn_Not_See_The_Results() {
    restAssuredThat(response -> response.body("detail.error", Matchers.equalTo(true)));
    }
}
