package TestNgpro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
  @Test(priority=1,groups="sanity")
  public void f() {
	  System.out.println("first testng programe");
  }
  @Test(priority=2,groups="regression")
  public void s() {
	  System.out.println("this is the s method");
  }
  @Test(priority=3,groups="sanity")
  public void failedtest() {
	  Assert.assertEquals(false, true);
	  
  }
}
