package TestNgpro;

import org.testng.annotations.Test;

public class Dependncy_Demo {
  @Test(priority=0)
  public void TestOne() 
  {
	  System.out.println("this is TestOne");
  }
  @Test(priority=1)
  public void TestSecond() 
  {
	  System.out.println("This is SecondTest");
  }
  @Test(priority=2)
  public void TestThree()
  {
	System.out.println("This is ThirdTest");  
  }
  @Test(priority=3)
  public void FrothTest()
  {
	  System.out.println("This is ForthTest");
  }
}
