package example;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class readKeyPropertiesFile {

	public static void main(String[] args) throws IOException {

		FileInputStream fs =new FileInputStream("C:\\Users\\vkumar15\\eclipse\\AutomationLearning\\src\\objects.properties");		
		
		Properties prop =new Properties();
		prop.load(fs);

		System.out.println(prop.getProperty("url"));
		System.out.println(prop.getProperty("uid"));
		

	}

}
