package com.automation.runners;

import io.cucumber.junit.CucumberOptions;
import jxl.common.Logger;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/build/cucumber.json","html:target/build/cucumber-report.html"},
        features = {"src/main/resources/features"},
        glue = {"com.automation.stepdefinitions",
                "com.automation.hooks"},
        tags = "@login-no-recurrente-1"
)
public class CucumberTestSuite {
    private static EnvironmentVariables envs = SystemEnvironmentVariables.createEnvironmentVariables();

    @BeforeClass
    public static void beforeAll(){
        Logger.getLogger(CucumberTestSuite.class.getName().getClass()).info("Before All");
    }
}