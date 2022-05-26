package co.com.choucair.certification.openCart.questions;

import co.com.choucair.certification.openCart.userinterfaces.ProductsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class CheckFilter implements Question<Boolean> {
    private String item;
    public CheckFilter(String item) {this.item = item;}

    public static CheckFilter toThe(String item) { return new CheckFilter(item);}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        WaitUntil.the(ProductsPage.ITEM_NAME, isVisible()).forNoMoreThan(1000).milliseconds();
        String textFind = actor.asksFor(Text.of(ProductsPage.ITEM_NAME).asString());
        if(item.equals(textFind)){
            result = true;
        }else{result = false;}
        return result;
    }
}
