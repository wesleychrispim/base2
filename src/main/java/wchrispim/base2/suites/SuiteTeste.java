package wchrispim.base2.suites;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import wchrispim.base2.core.DriverFactory;
import wchrispim.base2.test.TesteMantis;


@RunWith(Suite.class)
@SuiteClasses({
	TesteMantis.class,
	
})
public class SuiteTeste {
	
	@AfterClass
	public static void finalizaTudo(){
		DriverFactory.killDriver();
	}

}
