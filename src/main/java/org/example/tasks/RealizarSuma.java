package org.example.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static org.example.userinterfaces.CalculadoraPage.BOTON_IGUAL;
import static org.example.userinterfaces.CalculadoraPage.BOTON_NUMERO_CINCO;
import static org.example.userinterfaces.CalculadoraPage.BOTON_NUMERO_SIETE;
import static org.example.userinterfaces.CalculadoraPage.BOTON_SUMA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class RealizarSuma implements Task {

    public static RealizarSuma suma(){
        return instrumented(RealizarSuma.class);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BOTON_NUMERO_SIETE));
        actor.attemptsTo(Click.on(BOTON_SUMA));
        actor.attemptsTo(Click.on(BOTON_NUMERO_CINCO));
        actor.attemptsTo(Click.on(BOTON_IGUAL));
    }
}
