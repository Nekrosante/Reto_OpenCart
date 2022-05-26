package co.com.choucair.certification.openCart.tasks;

import co.com.choucair.certification.openCart.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FilterItem implements Task {
    private String item;

    public FilterItem(String item) {
        this.item = item;
    }

    public static FilterItem inFilterPanel(String item) { return Tasks.instrumented(FilterItem.class, item);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(ProductsPage.NAME_FILTER, isVisible()).forNoMoreThan(1000).milliseconds(),
                Enter.theValue(item).into(ProductsPage.NAME_FILTER),
                Click.on(ProductsPage.BUTTON_FILTER)
        );
    }
}
