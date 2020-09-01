import cucumber.api.CucumberOptions;

@CucumberOptions(

        features = "src/test/resources/features",

        glue = {"stepDefinitions"},

        tags = {"@CyrilTest"}
        )

public class TestRunner {

}
