package com.automation.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class HomeScreen {
    public static Target TITLE_POPUP_HOME = Target.the("Titulo de popup: Todo a un Plin de distancia")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/lyNewHome"))
            .locatedForIOS(AppiumBy.accessibilityId("titleLabel"));
}
