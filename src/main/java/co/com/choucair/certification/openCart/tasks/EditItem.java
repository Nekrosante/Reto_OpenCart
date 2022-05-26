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

public class EditItem implements Task {
    public static EditItem inListProduct() { return Tasks.instrumented(EditItem.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        Constants DATA = new Constants();
        actor.attemptsTo(
                WaitUntil.the(ProductsPage.BUTTON_EDIT, isVisible()).forNoMoreThan(1000).milliseconds(),
                Click.on(ProductsPage.BUTTON_EDIT),
                WaitUntil.the(ProductsPage.PRODUCT_NAME, isVisible()).forNoMoreThan(1000).milliseconds(),
                Enter.theValue(DATA.getNAME_PRODUCT()).into(ProductsPage.PRODUCT_NAME),
                Click.on(ProductsPage.BUTTON_SAVE)
        );
    }
}
