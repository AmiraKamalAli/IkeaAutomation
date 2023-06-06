package listeners;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import utils.ExtentManager;

public class ListenerClass extends ExtentManager implements ITestListener {

	public static ExtentTest logger;
	

	public void onTestStart(ITestResult result) {
		logger = extent.createTest(result.getName());
		logger.log(Status.INFO, "Test case is Started : " + result.getName());
	}

	public void onTestSuccessMobile(ITestResult result, String fullpath) {
		if (result.getStatus() == ITestResult.SUCCESS) {
		
			try {
				logger.log(Status.PASS, "Test case is passed " + result.getName());
				logger.log(Status.PASS, "ScreenShot is Attached to" + result.getName());
				logger.addScreenCaptureFromPath(fullpath, "Test case is passed and ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void onTestFailureMobile(ITestResult result, String fullpath) {
		// TODO Auto-generated method stub
		if (result.getStatus() == ITestResult.FAILURE) {
			try {
//				logger.log(Status.FAIL,MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				logger.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + "Test Case Failed", ExtentColor.RED));
				//logger.log(Status.FAIL, "ScreenShot is Attached to" + result.getName());
				logger.addScreenCaptureFromPath(fullpath, "Test Case Failed and ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public void onTestSkippedMobile(ITestResult result, String fullpath) {
		if (result.getStatus() == ITestResult.SKIP) {
			logger.log(Status.SKIP, "Skipped Test case is: " + result.getName());
			try {
				logger.skip("ScreenShot is Attached", MediaEntityBuilder.createScreenCaptureFromPath(fullpath).build());
				logger.addScreenCaptureFromPath(fullpath, "ScreenShot is Attached");

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}





	public void onTestStartmobile(Method method) {
		logger = extent.createTest(method.getName());
	}
}
