package com.automation.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class SecondOnboardingScreen {
    public static final Target LOGO_INTERBANK = Target.the("logo de Interbank")
            .locatedForAndroid(AppiumBy.accessibilityId("Logo interbank"))
            .locatedForIOS(AppiumBy.accessibilityId("imgInterbankLogo"));

    public static final Target TEXTO_HAZ_PAGOS = Target.the("texto 'Haz tus pagos al instante'")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Haz tus pagos al instante']"))
            .locatedForIOS(AppiumBy.accessibilityId("titleLabel"));

    public static final Target TEXTO_DISFRUTALOS = Target.the("texto 'Disfrútalos desde tu próximo inicio de sesión.'")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Disfrútalos desde tu próximo inicio de sesión.']"))
            .locatedForIOS(AppiumBy.accessibilityId("descriptionLabel"));

    public static final Target IMAGEN_ONBOARDING = Target.the("imagen del onboarding")
            .locatedForAndroid(AppiumBy.accessibilityId("Image onboarding"))
            .locatedForIOS(AppiumBy.xpath("imgLoginOnboarding"));

    public static final Target BOTON_ENTENDIDO = Target.the("botón Entendido")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='Entendido']"))
            .locatedForIOS(AppiumBy.className("XCUIElementTypeButton"));
}
