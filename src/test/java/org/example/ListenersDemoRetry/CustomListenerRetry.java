package org.example.ListenersDemoRetry;

import org.testng.*;

public class CustomListenerRetry implements IRetryAnalyzer {

        private int retryCount = 0;
        private static final int maxRetryCount = 3;

        @Override
        public boolean retry(ITestResult result) {
            if (retryCount < maxRetryCount) {
                if (result.getStatus() == ITestResult.FAILURE || result.getStatus() == ITestResult.SKIP) {
                    System.out.println("Retrying test " + result.getName() + " with status "
                            + getResultStatusName(result.getStatus()) + " for the " + (retryCount+1) + " time(s).");
                    retryCount++;
                    return true;
                }
            }
            return false;
        }

    public String getResultStatusName(int status) {
        switch (status) {
            case ITestResult.SUCCESS:
                return "SUCCESS";
            case ITestResult.FAILURE:
                return "FAILURE";
            case ITestResult.SKIP:
                return "SKIP";
            default:
                return "UNKNOWN";
        }
    }

}
