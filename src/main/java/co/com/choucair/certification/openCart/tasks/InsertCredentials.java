package co.com.choucair.certification.openCart.tasks;

import co.com.choucair.certification.openCart.model.Constants;
import co.com.choucair.certification.openCart.userinterfaces.OpenCartPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertCredentials implements Task {
    public static InsertCredentials requiredFields() {return Tasks.instrumented(InsertCredentials.class);}

    @Override
    public <T extends Actor> void performAs(T actor) {
        Constants DATA = new Constants();
        actor.attemptsTo(
                Enter.theValue(DATA.getUSER()).into(OpenCartPage.USER_TEXTBOX),
                Enter.theValue(DATA.getPASSWORD()).into(OpenCartPage.PASSWORD_TEXTBOX),
                Click.on(OpenCartPage.LOGIN_BUTTON)
        );
    }
}
