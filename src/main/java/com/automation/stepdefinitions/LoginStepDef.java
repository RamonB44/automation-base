package com.automation.stepdefinitions;

import com.automation.questions.HomeQuestion;
import com.automation.task.LoginTask;
import com.automation.task.Welcome;
import com.automation.userinterfaces.HomeScreen;
import com.automation.userinterfaces.LoginScreen;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static org.hamcrest.Matchers.equalTo;

public class LoginStepDef {
    @Given("^el (.*) se encuentra en la pantalla de interbank$")
    public void elClienteSeEncuentraEnLaPantallaDeInterbank(String actor) {
        theActorCalled(actor).attemptsTo(
                Welcome.passWelcomeScreen()
        );
    }

    @When("ingresa el tipo de documento {string}, usuario {string} y password {string} en login")
    public void ingresaElUsuarioUserYPasswordPasswordEnLogin(String documentType, String user, String password) {
        theActorInTheSpotlight().attemptsTo(
                LoginTask.withCredentials(documentType, user, password)
        );
    }

    @And("luego ingresa al app")
    public void luegoIngresaAlApp() {
        theActorInTheSpotlight().attemptsTo(
                Click.on(LoginScreen.BOTON_INGRESAR)
        );
    }

    @Then("el cliente visualiza los productos de su cuenta")
    public void elClienteVisualizaLosProductosDeSuCuenta() {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(HomeScreen.TITLE_POPUP_HOME, isVisible()).forNoMoreThan(Duration.ofSeconds(20))
        );
        theActorInTheSpotlight().should(
                seeThat("Espero visualizar el titulo del popup Home", HomeQuestion.visibleTitlePopup(), equalTo(true))
        );
    }

    @And("valida la password ofuscada")
    public void validaLaContrasenaOfuscada() {
    }
}
