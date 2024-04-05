package MyRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/Feature/login.feature"},glue= {"StepDef"}
,plugin = {"pretty","json:target/cucumber.json"} ,  monochrome = true ,dryRun = false
)

public class Runner 
{
	
	

}
