package com.hienhoang.springbascis.steps;

import com.hienhoang.springbascis.models.TestUserDetails;
import com.hienhoang.springbascis.pages.HomePage;
import com.hienhoang.springbascis.pages.LoginPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    private LoginPage loginPage;

    @Autowired
    private HomePage homePage;


    @Autowired
    private TestUserDetails testUserDetails;

    @And("I enter the following for Login")
    public void iEnterTheFollowingForLogin(DataTable table) {
//        var data = table.asList();
        loginPage.Login(testUserDetails.getUserDetails().getUserName(), testUserDetails.getUserDetails().getPassword());
    }

    @And("^I click Logoff to logout")
    public void iClickLogoffToLogout() {
        homePage.ClickLogOff();
    }
}
