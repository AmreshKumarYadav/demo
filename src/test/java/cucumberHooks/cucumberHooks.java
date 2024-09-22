package cucumberHooks;

import com.mystore.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class cucumberHooks extends BaseClass {
	
	
	@Before
	
	public void setUp()
	{
		System.out.println("Browser is opened");
	}
	
	@After
	public void tearDown()
	{
		getDriver().quit();
	}

}
