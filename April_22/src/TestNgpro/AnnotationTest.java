package TestNgpro;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class AnnotationTest {
  @Test
  public void f() {
	  System.out.println("frist method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("before method excute before each test method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("after method excute before each test method");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("before class excute before frist method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After class excute after last method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("before test excute before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("after test excute after test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suit excute before test method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After suit excute After test method");
  }

}
