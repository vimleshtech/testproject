package logManager;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class testNGLogger extends TestListenerAdapter  implements ISuiteListener  {

	
	static BufferedWriter bw=null;
	
	public static void writeLog(String msg)
	{
		try {
			bw =new BufferedWriter(new FileWriter("log.txt",true));
			bw.write(msg);
			bw.newLine();
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void onStart(ISuite suite) {

		System.out.println("suite is  started - "+suite.getName());
		writeLog("suite is  started - "+suite.getName());
	
		
	}

	@Override
	public void onFinish(ISuite suite) {
		// TODO Auto-generated method stub
		
		System.out.println("suite is  completed - "+suite.getName());
		writeLog("suite is  completed - "+suite.getName());
		
		
	}
	
	@Override
	public void onTestStart(ITestResult tr) {
		writeLog("Test Started....");
	}

	@Override
	public void onTestSuccess(ITestResult tr) {

		writeLog("Test '" + tr.getName() + "' PASSED");

		// This will print the class name in which the method is present
		//writeLog(tr.getTestClass());

		// This will print the priority of the method.
		// If the priority is not defined it will print the default priority as
		// 'o'
		writeLog("Priority of this method is " + tr.getMethod().getPriority());

		System.out.println(".....");
	}

	@Override
	public void onTestFailure(ITestResult tr) {

		writeLog("Test '" + tr.getName() + "' FAILED");
		writeLog("Priority of this method is " + tr.getMethod().getPriority());
		System.out.println(".....");
	}

	@Override
	public void onTestSkipped(ITestResult tr) {
		writeLog("Test '" + tr.getName() + "' SKIPPED");
		System.out.println(".....");
	}


}
