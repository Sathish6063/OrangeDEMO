package runnerORANGE;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import orangeBASE.Base4ORANGE;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\saskl\\eclipse-workspace\\Orange.cucumber\\src\\test\\resources", glue= {"stepDefinition"}, dryRun=false,monochrome=false,plugin="pretty")

public class Runner4Orange extends Base4ORANGE {

	public static WebDriver driver;
	
	
	}
	



