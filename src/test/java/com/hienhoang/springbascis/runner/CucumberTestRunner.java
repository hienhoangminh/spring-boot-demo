package com.hienhoang.springbascis.runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = {"src/test/java/com/hienhoang/springbascis/features"},
        plugin = {
                "pretty",
                "json:target/cucumber.json"
        },
        glue = "com.hienhoang.springbascis.steps"
)
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    @Override
    public Object[][] scenarios(){
        return super.scenarios();
    }

}
