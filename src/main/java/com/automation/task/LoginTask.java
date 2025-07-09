package com.automation.task;

import com.automation.userinterfaces.FirstOnboardingScreen;
import com.automation.userinterfaces.LoginScreen;
import com.automation.userinterfaces.SecondOnboardingScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginTask implements Task {
    private final String documentType, username, password;

    public LoginTask(String documentType, String username, String password) {
        this.documentType = documentType;
        this.username = username;
        this.password = password;
    }

    public static LoginTask withCredentials(String documentType, String username, String password) {
        return instrumented(LoginTask.class, documentType, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(LoginScreen.TEXTO_BIENVENIDA, isVisible()).forNoMoreThan(30).seconds()
        );

        if(documentType.equalsIgnoreCase("CE")){
            actor.attemptsTo(
                    Click.on(LoginScreen.TEXTO_TIPO_DOCUMENTO),
                    Enter.theValue("CE").into(LoginScreen.TEXTO_TIPO_DOCUMENTO)
            );

        }
        else if(documentType.equalsIgnoreCase("Pasaporte")){
            actor.attemptsTo(
                    Click.on(LoginScreen.TEXTO_TIPO_DOCUMENTO),
                    Enter.theValue("Pasaporte").into(LoginScreen.TEXTO_TIPO_DOCUMENTO)
            );
        }

        actor.attemptsTo(
            Enter.theValue(username).into(LoginScreen.INPUT_DOCUMENTO)
        );

        actor.attemptsTo(
                Enter.theValue(password).into(LoginScreen.INPUT_CONTRASENA)
        );

    }
}