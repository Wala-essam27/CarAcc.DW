package Pro.testing;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features= "Pro_cases",monochrome = true,
snippets = SnippetType.CAMELCASE, glue = {"Pro.testing"})
public class testing {

}
