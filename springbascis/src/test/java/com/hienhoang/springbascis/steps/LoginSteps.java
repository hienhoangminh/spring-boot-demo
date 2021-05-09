package com.hienhoang.springbascis.steps;

import com.hienhoang.springbascis.models.TestUserDetails;
import com.hienhoang.springbascis.models.UserDetails;
import com.hienhoang.springbascis.pages.HomePage;
import com.hienhoang.springbascis.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class LoginSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    @Autowired
    private TestUserDetails testUserDetails;

    @Given("^I click login in Home Page$")
    public void iClickLoginInHomePage() {
        homePage.ClickLoginLink();

        //Scenario scope
        testUserDetails.setUserDetails(new UserDetails("admin", "password"));
    }

    @And("I click login button")
    public void iClickLoginButton() {
        loginPage.ClickLogin();
    }

    @Then("I should see the userform page")
    public void iShouldSeeTheUserformPage() {
        Assert.assertEquals(homePage.isEmployeeDetailsExist(), true);

    }

}
