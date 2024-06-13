package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

import co.com.devco.automation.mobile.locator.Locator;

import static co.com.devco.automation.mobile.locator.ElementFinder.theElementBy;
import static co.com.devco.automation.mobile.locator.Locator.locator;

public class CalculadoraPage{

    public static final Locator BOTON_NUMERO_SIETE_LOCATOR = locator()
            .withAndroidId("com.hihonor.calculator:id/digit_7")
            .withIosAccesibilityId("1");
    public static final Locator BOTON_NUMERO_CINCO_LOCATOR = locator()
            .withAndroidId("com.hihonor.calculator:id/digit_5")
            .withIosAccesibilityId("1");

    public static final Locator BOTON_SUMA_LOCATOR = locator()
            .withAndroidId("com.hihonor.calculator:id/op_add")
            .withIosAccesibilityId("1");

    public static final Locator BOTON_IGUAL_LOCATOR = locator()
            .withAndroidId("com.hihonor.calculator:id/eq")
            .withIosAccesibilityId("1");

    public static final Locator RESULTADO_LOCATOR = locator()
            .withAndroidId("com.hihonor.calculator:id/formula")
            .withIosAccesibilityId("1");

    public static final Target BOTON_NUMERO_SIETE = Target.the("Botón número Siete").located(theElementBy(BOTON_NUMERO_SIETE_LOCATOR));
    public static final Target BOTON_NUMERO_CINCO = Target.the("Botón número Cinco").located(theElementBy(BOTON_NUMERO_CINCO_LOCATOR));
    public static final Target BOTON_SUMA = Target.the("Botón Suma").located(theElementBy(BOTON_SUMA_LOCATOR));
    public static final Target BOTON_IGUAL = Target.the("Botón Suma").located(theElementBy(BOTON_IGUAL_LOCATOR));
    public static final Target RESULTADO = Target.the("Resultado").located(theElementBy(RESULTADO_LOCATOR));
}
