package com.automation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class LoginQuestion implements Question<Boolean> {
    private final Target target;

    public LoginQuestion(Target target) {
        this.target = target;
    }

    public static LoginQuestion of(Target target) {
        return new LoginQuestion(target);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return target.resolveFor(actor).isVisible();
    }
}