package co.com.choucair.certification.openCart.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
    public static final Target MENU_CATALOG = Target.the("Menu Catalog")
            .located(By.id("menu-catalog"));
    public static final Target SUBMENU_PRODUCTS = Target.the("Menu products")
            .located(By.xpath("//a[contains(text(),'Products')]"));
}
