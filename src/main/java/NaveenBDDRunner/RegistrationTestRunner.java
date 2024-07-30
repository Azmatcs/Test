package NaveenBDDRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/main/java/Features/Uber.feature", glue="NaveenBDDStep",
		
		plugin= {"html:target/NaveenBDDStep.html","pretty"})

public class RegistrationTestRunner extends AbstractTestNGCucumberTests {

}
