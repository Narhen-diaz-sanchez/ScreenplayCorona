package co.corona.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/ValidacionElemento.Feature",
        glue = "co.corona.stepDefinitions",
        snippets = SnippetType.CAMELCASE

)

public class ValidacionElementoRunner {
}