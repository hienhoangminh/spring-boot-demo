package com.hienhoang.springbascis;

import com.hienhoang.springbascis.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;
import java.util.List;

@SpringBootTest
//@Profile("qa")
class SpringbascisApplicationTests {

    @Autowired
    private MainPage mainPage;


    @Value("${app.url}")
    private String environment;

    @Value("chrome,firefox,edge")
    private List<String> browsers;


    @Test
    void performLoginTest() {
//        mainPage.navigateToUrl();
        mainPage.PerformLogin();
    }

}
