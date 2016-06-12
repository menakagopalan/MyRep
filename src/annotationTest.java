


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class annotationTest {
  @Test
  public void myTestMethod1() {
	    System.out.println("myTestMethod1");
	  }

	  @Test
	  public void myTestMethod2() {
	    System.out.println("myTestMethod2");
	  }
	

@BeforeClass
public void beforeClass() {
  System.out.println("BeforeClass");
}

@BeforeMethod
public void beforeMethod() {
  System.out.println("BeforeMethod");
}

@AfterMethod
public void afterMethod() {
  System.out.println("AfterMethod");
}

@AfterClass
public void afterClass() {
  System.out.println("AfterClass");
}

@AfterTest
public void afterTest() {
  System.out.println("AfterTest");
}
}
