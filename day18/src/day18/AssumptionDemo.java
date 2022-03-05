package day18;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
	@Test
	void testOnDev()
	{
		System.setProperty("ENV","DEV");
		Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV")));
	}

	@Test
	void testOnProd()
	{
		System.setProperty("ENV","PROD");
		Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), AssumptionDemo:: message);
	}
	
	private static String message () {
		return "Today's TEST Execution failed ::";
	}

}
