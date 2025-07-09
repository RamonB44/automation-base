package com.automation.userinterfaces;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class FirstOnboardingScreen {
    public static Target WELCOME_TEXT = Target.the("Mensaje de bienvenida del primer ob")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/tvWelcomeText"))
            .locatedForIOS(AppiumBy.accessibilityId("titleLabel"));
    public static Target BTN_SIGN_UP = Target.the("Boton de registro")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/btnSignIn"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Iniciar sesión\"]"));
    public static final Target BOTON_REGISTRARSE = Target.the("botón registrarse")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/btnSignUp"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Registrarme\"]"));

    public static final Target BOTON_SOY_VISITANTE = Target.the("botón soy visitante")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/btnIAmVisitor"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Aún no soy cliente\"]"));

    public static final Target BOTON_MENU = Target.the("botón menú principal")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/btnMenu"))
            .locatedForIOS(AppiumBy.accessibilityId("icMenuV2"));

    public static final Target ICONO_TITULO = Target.the("ícono del título")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/iv_title"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeNavigationBar[@name=\"Interbank_UAT.IBKNewOnboardingView\"]/XCUIElementTypeImage"));

    public static final Target TEXTO_VERSION_APP = Target.the("texto con versión de la app")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/tvAppVersion"))
            .locatedForIOS(AppiumBy.xpath("//xx"));


}
