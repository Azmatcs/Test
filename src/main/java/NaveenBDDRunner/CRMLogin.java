package NaveenBDDRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features="src/main/java/Features", glue="NaveenBDDStep",
		
		monochrome=true,plugin= {"html:target/NaveenBDDStep.html","pretty"})
public class CRMLogin extends AbstractTestNGCucumberTests{

}