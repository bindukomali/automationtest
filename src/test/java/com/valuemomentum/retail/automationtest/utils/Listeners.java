package com.valuemomentum.retail.automationtest.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Listeners implements ITestListener {

	protected static ExtentReports reports;
	protected static ExtentTest test;
	protected static ExtentSparkReporter spark;

	@Override
	public void onTestStart(ITestResult result) {
		test = reports.createTest(result.getMethod().getMethodName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
// ITestListener.super.onTestSuccess(result);
		test.log(Status.PASS, result.getMethod().getMethodName() + "Test Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getMethod().getMethodName() + "Test Failed");
		WebDriverHelper.captureScreenshot(result.getMethod().getMethodName());

		test = test.addScreenCaptureFromPath("C:\\training\\java\\automationtest\\ScreenShot\\" + result.getMethod().getMethodName() + ".png");
//ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		test.log(Status.SKIP, result.getMethod().getMethodName() + "Test Skipeed");
//ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		reports = new ExtentReports();
		spark = new ExtentSparkReporter(
				"target/" + new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss").format(new Date()) + "reports.html");
	}

	@Override
	public void onFinish(ITestContext context) {
		reports.attachReporter(spark);
		reports.flush();
	}

}