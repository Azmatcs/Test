package NaveenBDDRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/main/java/Features", glue="NaveenBDDStep",
		
		monochrome=true,plugin= {"pretty","html:target/NaveenBDDStep.html", "json:target/report.json"})
public class CRMLogin extends AbstractTestNGCucumberTests{

}
