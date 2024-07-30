package NaveenBDDRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/main/java/Features/Uber.feature", glue="NaveenBDDStep",
		
		plugin= {"pretty","html:target/NaveenBDDStep.html", "json:target/report.json"})

public class RegistrationTestRunner extends AbstractTestNGCucumberTests {

}
