
package com.automation.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import io.appium.java_client.AppiumBy;

public class LoginScreen {
    public static final Target BOTON_MENU = Target.the("botón del menú")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/btnMenu"))
            .locatedForIOS(AppiumBy.accessibilityId("icMenuV2"));

    public static final Target ICONO_TITULO = Target.the("ícono superior")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/iv_title"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeNavigationBar[@name=\"Interbank_UAT.IBKLoginView\"]/XCUIElementTypeOther[2]/XCUIElementTypeImage"));

    public static final Target TEXTO_VERSION = Target.the("texto de versión de la app")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/tvAppVersion"))
            .locatedForIOS(AppiumBy.accessibilityId("versionLabel"));

    public static final Target TEXTO_BIENVENIDA = Target.the("texto de bienvenida: 'Ten tu App siempre a la mano'")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/tvWelcomeText"))
            .locatedForIOS(AppiumBy.accessibilityId("Ten tu App siempre a la mano"));

    public static final Target TEXTO_TIPO_DOCUMENTO = Target.the("texto: 'DNI, CE, PASAPORTE'")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/tvText"))
            .locatedForIOS(AppiumBy.accessibilityId("textField"));

    public static final Target OPCION_TIPO_DOCUMENTO = Target.the("opción desplegable de tipo de documento")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.TextView[@text='DNI']")) // valor puede variar
            .locatedForIOS(AppiumBy.xpath("//x"));

    public static final Target INPUT_DOCUMENTO = Target.the("campo para número de documento")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@text='Nº de documento']"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeTextField[@value=\"Nº de documento\"]"));

    public static final Target INPUT_CONTRASENA = Target.the("campo para contraseña")
            .locatedForAndroid(AppiumBy.xpath("//android.widget.EditText[@text='Contraseña']"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeSecureTextField[@value=\"Contraseña\"]"));

    public static final Target BOTON_INGRESAR = Target.the("botón ingresar")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/btnLogin"))
            .locatedForIOS(AppiumBy.xpath("//XCUIElementTypeButton[@name=\"Ingresar\"]"));

    public static final Target BOTON_OLVIDASTE_CONTRASENA = Target.the("botón '¿Olvidaste tu contraseña?'")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/btnForgetPassword"))
            .locatedForIOS(AppiumBy.accessibilityId("forgotPasswordLabel"));

    public static final Target ACCION_REGISTRARSE = Target.the("acción 'Regístrate aquí'")
            .locatedForAndroid(AppiumBy.id("pe.com.interbank.mobilebanking.test:id/tvSignUp"))
            .locatedForIOS(AppiumBy.accessibilityId("registerLabel"));

}
