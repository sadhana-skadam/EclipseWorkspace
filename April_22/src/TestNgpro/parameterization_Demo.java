package TestNgpro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization_Demo {
  @Test
  @Parameters({"val1","val2"})
  public void sum( int val1,int val2) {
	   int sum=val1+val2;
	  System.out.println(+sum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void sub(int val1,int val2) {
	  int sub=val1-val2;
	  System.out.println(+sub);
  }
}
