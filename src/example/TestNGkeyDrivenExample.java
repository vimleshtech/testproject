package example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class TestNGkeyDrivenExample {
	
	//global object
	Properties prop=null;
	
  @Test
  public void f() {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(prop.getProperty("url"));
	  
	  driver.findElement(By.id(prop.getProperty("uid"))).sendKeys("");
	  
	  
  }
  @BeforeTest
  public void beforeTest() throws IOException {
	  	
	  FileInputStream fs =new FileInputStream("C:\\Users\\vkumar15\\eclipse\\AutomationLearning\\src\\objects.properties");		
		
	  prop =new Properties();
	  prop.load(fs);

	  
  }

}
