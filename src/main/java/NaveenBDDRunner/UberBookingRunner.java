package NaveenBDDRunner;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src/main/java/Features/Uber.feature",glue="NaveenBDDStep",monochrome=true,
        tags="@Regression and @SMOKE",
		plugin= {"pretty","html:target/NaveenBDDStep.html","html:target/NaveenBDDStep.xml"}
		)


public class UberBookingRunner extends AbstractTestNGCucumberTests {

}

