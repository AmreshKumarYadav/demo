package Runner;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.mystore.utility.Log;

import io.cucumber.testng.*;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.PickleWrapper;
import io.cucumber.testng.TestNGCucumberRunner;
import com.mystore.base.BaseClass;



import static com.bdd.variables.GlobalVariables.*;


@CucumberOptions(features = "src/test/resources/FetureFile", glue = { "stepdef","cucumberHooks"}, tags = "@TestGoogle", 
plugin = { "pretty",
				"json:target/cucumber.json" }, monochrome = true)

public class TestRunner extends AbstractTestNGCucumberTests {
	public static TestNGCucumberRunner testRunner;
	String projectPath = System.getProperty("user.dir");
	BaseClass bc=new BaseClass();
	@BeforeClass
	public void setup() throws IOException {
		testRunner = new TestNGCucumberRunner(this.getClass());  
		Log.info("Project path in runner is : " + projectPath);
		bc.loadConfig("browser");
		

	}
	//, "html:target/cucumber-report.html"
//"com.bdd.hooks"
//	@Test(groups = "cucumber scenarios", description = "Runs Cucumber Scenarios", dataProvider = "scenarios")
//	public void scenario(PickleWrapper pickleEvent, FeatureWrapper  featureWrapper) {
//		try {
//			testRunner.runScenario(pickleEvent.getPickle());
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	@DataProvider
	public Object[][] scenarios() {
		if (testRunner == null) {
			testRunner = new TestNGCucumberRunner(this.getClass());
		}
		return testRunner.provideScenarios();
	}

	//@AfterClass
//	public void tearDown() throws IOException {
//		quitDriver();
//		Log.info("End of execution for scenario: " + ScenarioName);
//		Log.info("Driver is closed");
//		//logFileName = Log.setLogfile(ScenarioName);
//	//	Log.copyFile(logFileName);
//		testRunner.finish();
//	}

}
