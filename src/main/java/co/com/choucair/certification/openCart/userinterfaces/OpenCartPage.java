package co.com.choucair.certification.openCart.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demo.opencart.com/admin/index.php?route=common/dashboard")
public class OpenCartPage extends PageObject {
    public static final Target USER_TEXTBOX = Target.the("text box where the user is inserted")
            .located(By.id("input-username"));
    public static final Target PASSWORD_TEXTBOX = Target.the("text box where the password is inserted")
            .located(By.id("input-password"));
    public static final Target LOGIN_BUTTON = Target.the("button login")
            .located(By.xpath("//button[@class='btn btn-primary']"));
}
