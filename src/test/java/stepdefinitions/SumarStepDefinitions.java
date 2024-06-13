package stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.example.userinterfaces.CalculadoraPage.RESULTADO;

import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;

import org.example.tasks.RealizarSuma;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class SumarStepDefinitions {


    @Dado("^que (.*) quiere usar la calculadora$")
    public void queJuanQuiereUsarLaCalculadora(String actor) {
        OnStage.theActor(actor).entersTheScene();
    }


    @Cuando("^(.*)realiza la operación suma de siete mas cinco$")
    public void realizaLaOperaciónSumaDeSieteMasCinco(String actor) {
        theActorCalled(actor).attemptsTo(RealizarSuma.suma());
    }

    @Entonces("^debe de ver el resultado (.*)$")
    public void debeDeVerElResultado(String resultado) {
        //theActorInTheSpotlight().should(seeThat(RESULTADO.resolveAllFor("Juan").text()).isEqualTo(resultado));
        theActorInTheSpotlight().attemptsTo(Ensure.that(RESULTADO).text().isEqualTo("12"));
    }
}
