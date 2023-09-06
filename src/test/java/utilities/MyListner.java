package utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListner implements ITestListener {

    public void onTestStart(ITestResult result) {
        System.out.println(".....Test Case Started..........");
    }

   public void onTestSuccess(ITestResult result) {
       System.out.println("...On Test success...");
    }

    public void onTestFailure(ITestResult result) {
        System.out.println("...On Test fail...");
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("...On Test skipped...");
    }

    public  void onFinish(ITestContext context) {
        System.out.println("...On Test finish...");
    }

}
