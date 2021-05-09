package com.hienhoang.springbascis.pages;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MainPage extends BasePage {

    @Autowired
    public HomePage homePage;

    @Autowired
    public LoginPage loginPage;

    public void PerformLogin() {
        homePage.ClickLoginLink();
        loginPage.Login("admin", "adminpassword");
        loginPage.ClickLogin();
    }
}
