package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    @Given("I am on the login page")
    public void onTheLoginPage() {
        loginPage.openUrl("https://www.saucedemo.com/");
        loginPage.validateOnLoginPage();
    }

    @When("I input valid username")
    public void inputValidUserName() {
        loginPage.inputUserName("standard_user");
    }

    @And("I input valid password")
    public void inputValidPassword() {
        loginPage.inputPassword("secret_sauce");
    }

    @And("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @Then("I am on the home page")
    public void onTheHomePage() {
        homePage.validateOnHomePage();
    }

    @When("I input locked username")
    public void inputLockedUsername() {
        loginPage.inputUserName("locked_out_user");
    }

    @Then("I can see error message {string}")
    public void validateErrorMessage(String message) {
        loginPage.validateErrorMessageIsDisplayed();
        loginPage.validateEqualErrorMessage(message);
    }

    @When("I input {string} username")
    public void iInputUsername(String username) {
        loginPage.inputUserName(username);
    }
}
