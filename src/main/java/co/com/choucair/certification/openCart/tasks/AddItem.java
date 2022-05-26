package co.com.choucair.certification.openCart.tasks;

import co.com.choucair.certification.openCart.model.Constants;
import co.com.choucair.certification.openCart.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddItem implements Task {
    public static AddItem newProduct() { return Tasks.instrumented(AddItem.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        Constants DATA = new Constants();
        actor.attemptsTo(
                WaitUntil.the(ProductsPage.BUTTON_ADD_NEW, isVisible()).forNoMoreThan(1000).milliseconds(),
                Click.on(ProductsPage.BUTTON_ADD_NEW),
                WaitUntil.the(ProductsPage.PRODUCT_NAME, isVisible()).forNoMoreThan(1000).milliseconds(),
                Enter.theValue(DATA.getNAME_PRODUCT()).into(ProductsPage.PRODUCT_NAME),
                Enter.theValue(DATA.getMETA_TAG_TITLE()).into(ProductsPage.META_TAG),
                Click.on(ProductsPage.BUTTON_SAVE)
        );
    }
}
