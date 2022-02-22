package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome = true,
plugin ={"pretty","json:target/cucumber.json",
		"html:Reports/HtmlReports",
		"junit:Reports/Junit/report.xml"}


)
public class TestRunner {

}
