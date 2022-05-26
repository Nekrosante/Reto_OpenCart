package co.com.choucair.certification.openCart.tasks;


import co.com.choucair.certification.openCart.userinterfaces.DashboardPage;;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InCatalog  implements Task {
    public static InCatalog selectProduct() { return Tasks.instrumented(InCatalog.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(DashboardPage.MENU_CATALOG),
                WaitUntil.the(DashboardPage.SUBMENU_PRODUCTS, isVisible()).forNoMoreThan(1000).milliseconds(),
                Click.on(DashboardPage.SUBMENU_PRODUCTS)
        );
    }
}
