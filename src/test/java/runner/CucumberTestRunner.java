package runner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Featurefiles", 
		glue = {"stepDefination" ,"hooks"},
		tags = "@Smoke",
		plugin = {"html:target/cucumber.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)
public class CucumberTestRunner {

}
