package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "C:\\Users\\Windows 10\\IdeaProjects\\BDD2\\src\\test\\resources\\Featuers\\Login.Feature",
        glue = ("StepDefinitions"),
        dryRun = false,
        strict = false
)

public class TestRunner1 {
}
