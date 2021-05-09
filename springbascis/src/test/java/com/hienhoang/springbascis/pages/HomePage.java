package com.hienhoang.springbascis.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HomePage extends BasePage {

    @FindBy(how = How.LINK_TEXT, using = "Login")
    public WebElement linkLogin;

    @FindBy(how = How.LINK_TEXT, using = "Employee List")
    public WebElement linkEmployeeList;

    @FindBy(how = How.LINK_TEXT, using = "Employee Details")
    private WebElement linkEmployeeDetails;

    @FindBy(how = How.LINK_TEXT, using = "Log off")
    private WebElement linkLogOff;

    public void ClickLoginLink() {
        linkLogin.click();
    }

    public void ClickEmployeeLink() {
        linkEmployeeList.click();
    }

    public boolean isEmployeeDetailsExist() {
        return linkEmployeeDetails.isDisplayed();
    }

    public void ClickLogOff() {
        linkLogOff.click();
    }
}
