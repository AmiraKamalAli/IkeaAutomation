package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URL;
import java.time.Duration;
import java.util.Base64;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import listeners.ListenerClass;
import utils.ExtentManager;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.HTMLReporter;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidStartScreenRecordingOptions;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {

	protected static AndroidDriver<MobileElement> driver;
	protected static Capabilities caps;
	protected FileInputStream inputStream;
	protected Properties prop;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static HTMLReporter htmlReporter;

	public Base() {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	@BeforeSuite
	public void beforeSuite() throws IOException {
		ExtentManager.setExtent();
		File propFile = new File("src\\main\\java\\configuration\\config.properties");
		inputStream = new FileInputStream(propFile);
		prop = new Properties();
		prop.load(inputStream);
	     File app = new File(prop.getProperty("androidAppPath"));

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("deviceName", prop.getProperty("deviceName"));
		caps.setCapability("platformName", prop.getProperty("platformName"));
		caps.setCapability("platformVersion", prop.getProperty(" platformVersion"));
		caps.setCapability("AUTOMATION_NAME", prop.getProperty("androidAutomationName"));
		caps.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
		caps.setCapability("appPackage", prop.getProperty("appPackage"));
		caps.setCapability("appActivity", prop.getProperty("appActivity"));
		caps.setCapability("remoteAppsCacheLimit", "0");
		caps.setCapability("newCommandTimeout", "8000");	
		driver = new AndroidDriver<MobileElement>(new URL(prop.getProperty("appiumServerLink")), caps);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.startRecordingScreen(
                new AndroidStartScreenRecordingOptions()
                        .withVideoSize("1280x720")
                        .withTimeLimit(Duration.ofSeconds(200)));

	};

	@AfterSuite
	public void afterSuite() throws IOException {
		ExtentManager.endReport();
		   String video =driver.stopRecordingScreen();
	        byte[] decode = Base64.getDecoder().decode(video);
	        FileUtils.writeByteArrayToFile(new File("02-testRecording//androidclip.mp4"), decode);
	//	driver.quit();
	}

	@AfterMethod
	public void afterMethod(Method method, ITestResult result) throws InterruptedException {
		Thread.sleep(1000);
		ListenerClass listenerClass = new ListenerClass();

		File image = driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(image, new File("Snapshots/" + method.getName() + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		String Fullpath = System.getProperty("user.dir") + File.separator + "Snapshots/" + method.getName() + ".jpg";

		if (result.getStatus() == ITestResult.SUCCESS) {
	listenerClass.onTestSuccessMobile(result, Fullpath);
		
		} else if (result.getStatus() == ITestResult.FAILURE) {
			listenerClass.onTestFailureMobile(result, Fullpath);
		} else {
			listenerClass.onTestSkippedMobile(result, Fullpath);
		}
	}




}
