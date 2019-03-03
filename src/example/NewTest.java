package example;

import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class NewTest {
	Logger logger = Logger.getLogger(NewTest.class);
	
  @Test
  public void f() {
	  logger.info("----------------------------");
	  logger.info("function f is started..");
	  
	  logger.info("function f is end..");
	  System.out.println("hi");
  }
  
  @Test 
  public void hello()
  {
	  logger.info("function hello is running..");
	  System.out.println("hello");
	  logger.info("function hello is completed..");
  }
  
  @AfterClass
  public void afterClass() {
  }

  @AfterTest
  public void afterTest() {
  }

}
