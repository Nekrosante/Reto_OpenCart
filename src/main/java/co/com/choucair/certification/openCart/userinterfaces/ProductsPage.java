package co.com.choucair.certification.openCart.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ProductsPage extends PageObject {
    public static final Target BUTTON_ADD_NEW= Target.the("Button Add New")
            .located(By.xpath("//a[@data-original-title='Add New']"));
    public static final Target PRODUCT_NAME = Target.the("Textbox product name")
            .located(By.id("input-name1"));
    public static final Target META_TAG = Target.the("Textbox Meta Tag Title")
            .located(By.id("input-meta-title1"));
    public static final Target NAME_FILTER = Target.the("Textbox input name filter")
            .located(By.id("input-name"));
    public static final Target BUTTON_SAVE = Target.the("Button Save")
            .located(By.xpath("//button[@data-original-title='Save']"));
    public static final Target BUTTON_EDIT = Target.the("Button Save")
            .located(By.xpath("(//a[@data-original-title='Edit'])[1]"));
    public static final Target BUTTON_FILTER = Target.the("Button Filter")
            .located(By.id("button-filter"));
    public static final Target WARNING_TEXT = Target.the("Menssage Warning")
            .located(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
    public static final Target ITEM_NAME = Target.the("name of the first search item with filter")
            .located(By.xpath("(//td[@class='text-left'])[4]"));

}