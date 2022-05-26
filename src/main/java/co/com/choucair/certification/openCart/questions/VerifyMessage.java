package co.com.choucair.certification.openCart.questions;


import co.com.choucair.certification.openCart.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;


public class VerifyMessage implements Question<Boolean> {
    public static VerifyMessage toThe() { return new VerifyMessage(); }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        WaitUntil.the(ProductsPage.WARNING_TEXT, isVisible()).forNoMoreThan(1000).milliseconds();
        if(ProductsPage.WARNING_TEXT.isVisibleFor(actor)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
