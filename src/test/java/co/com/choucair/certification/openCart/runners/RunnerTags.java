package co.com.choucair.certification.openCart.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features/opencart.feature",
        tags = "@UserStories",
        glue = "co.com.choucair.certification.openCart.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class RunnerTags {
}
