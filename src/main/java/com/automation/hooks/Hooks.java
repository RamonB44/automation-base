package com.automation.hooks;

import com.automation.util.Constants;
import com.automation.util.Utils;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {
    private Scenario scenario;

    @After
    public void tearDown() {
        // Limpieza después de cada escenario
        Serenity.getDriver().quit();
    }

    @Before(order = 0)
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.aNewActor().attemptsTo();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario) {
        this.scenario = scenario;
        Utils.saveVariableOnSession(Constants.SCENARIO, this.scenario);
    }

    @Before("@mobile")
    public void clearAppData() {
        String command = "adb shell pm clear pe.com.interbank.mobilebanking.test";
        Utils.executeCommand(command);
    }
}