package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

//        provide feature file path
        features = "C:\\Users\\Windows 10\\IdeaProjects\\BDD1\\src\\test\\resources\\Features\\Login.Feature",
//        path for step definition to connect both file together
        glue = ("StepDefinitions"),
//        dryrun check every steps are defined or not
        dryRun = false
//        strict fail the execution if any steps are pending
//        strict = false


)
public class TestRunner {
}
