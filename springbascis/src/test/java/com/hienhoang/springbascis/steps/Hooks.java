package com.hienhoang.springbascis.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.testng.annotations.*;

public class Hooks {

    @Autowired
    private WebDriver driver;


    @Value("${app.url}")
    private String url;


    @Before
    public void InitializeTest(Scenario scenario) {
        driver.navigate().to(url);
    }

    @After
    public void TearDownTest(Scenario scenario) {
        if (scenario.isFailed()) {
            //Take screenshot logic here
            System.out.println(scenario.getName());
        }
        driver.quit();
    }

//    @AfterClass
//    public void tearDown(){
//        driver.quit();
//    }
}
