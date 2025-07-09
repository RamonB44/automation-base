package com.automation.task;

import com.automation.userinterfaces.FirstOnboardingScreen;
import com.automation.userinterfaces.SecondOnboardingScreen;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Welcome implements Task {

    public static Performable passWelcomeScreen(){
        return instrumented(Welcome.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(FirstOnboardingScreen.WELCOME_TEXT, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(FirstOnboardingScreen.BTN_SIGN_UP),
                WaitUntil.the(SecondOnboardingScreen.TEXTO_HAZ_PAGOS, isVisible()).forNoMoreThan(30).seconds(),
                Click.on(SecondOnboardingScreen.BOTON_ENTENDIDO)
        );

    }
}
