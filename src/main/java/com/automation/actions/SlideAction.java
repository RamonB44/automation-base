package com.automation.actions;

import io.appium.java_client.AppiumDriver;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Action;
import net.serenitybdd.screenplay.Tasks;
import org.openqa.selenium.WebElement;

public class SlideAction implements Action {
    private final WebElement element;

    public SlideAction(WebElement element) {
        this.element = element;
    }

    public static SlideAction on(WebElement element) {
        return Tasks.instrumented(SlideAction.class, element);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Implementa la lógica de slide/swipe aquí
    }
}