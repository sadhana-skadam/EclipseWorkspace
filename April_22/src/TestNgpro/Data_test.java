package TestNgpro;

import org.testng.annotations.DataProvider;

public class Data_test {
	 @DataProvider
	  public Object[][] dp() {
	    return new Object[][] {
	      new Object[] { "OFB764", "Svg@8888" },
	      new Object[] { "XAB345", "Sdk@7499" },
	    };

}
}
