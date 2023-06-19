package Utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class AutomationReport {

	public static void main(String[] args) {
		
		//Blank html
		ExtentSparkReporter Reporter = new ExtentSparkReporter("./TestReport.html");
		
		//Report
		ExtentReports Extent = new ExtentReports();
		Extent.attachReporter(Reporter);
		
		ExtentTest Test = Extent.createTest("TC001 - Login Page");
		Test.assignAuthor("Akash M");
		Test.assignCategory("Smoke Testing");
		Test.pass("Pass the URL");
		Test.pass("Enter the Email");
		Test.pass("Enter the Password");
		Test.pass("Click the login button", MediaEntityBuilder.createScreenCaptureFromPath("Automation Report.png").build());
		
		Extent.flush();
		
	}

}
