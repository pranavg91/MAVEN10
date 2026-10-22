package mavenpractise;

import org.testng.Assert;
import org.testng.annotations.Test;

public class practise1Test {

@Test
	public void data() {
		// TODO Auto-generated method stub

	 String actual = "Testing";

	    System.out.println(actual);

	    Assert.assertEquals(actual, "Testing");

	}

}
