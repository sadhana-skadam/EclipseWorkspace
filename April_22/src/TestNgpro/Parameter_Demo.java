package TestNgpro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter_Demo {
  @Test
  @Parameters({"val1","val2"})
  public void sum(int v1,int v2) {
	  int finalsum=v1+v2;
	  System.out.println(finalsum);
  }
  @Test
  @Parameters({"val1","val2"})
  public void diff(int v1, int v2) {
	  int finaldiff=v1-v2;
	  System.out.println(finaldiff);
  }
  @Test
  @Parameters({"val1","val2"})
  public void mul(int v1, int v2) {
	  int finalmul=v1*v2;
	  System.out.println(finalmul);
  }
  
  
  
	  
	  
  
}
