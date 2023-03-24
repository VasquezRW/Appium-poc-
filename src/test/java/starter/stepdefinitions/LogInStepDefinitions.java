package starter.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import starter.questions.LoginQuestion;
import starter.tasks.LoginTasks;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LogInStepDefinitions {
    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("The user goes to Login Screen")
    public void theUserOpensTheApp() {
        theActorCalled("Alice").attemptsTo(
                LoginTasks.goToLogin()
        );
    }
    @When("He types {string} {string}")
    public void theUserGoesToLoginScreenAndType(String arg0, String arg1) {
        theActorInTheSpotlight().attemptsTo(
                LoginTasks.enterCredentials(arg0, arg1)
        );
    }
    @Then("The user should see the message {string}")
    public void theUserShouldSeeTheMessage(String arg0) {
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(LoginQuestion.checkLogin(arg0))
        );
    }
}
