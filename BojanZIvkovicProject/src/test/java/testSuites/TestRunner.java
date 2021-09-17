package testSuites;

import org.junit.runner.*;
import org.junit.runner.notification.*;

public class TestRunner {
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(TestSuites.class);

        for (Failure failure : result.getFailures()){
            System.out.print(failure.toString());
        }
    }
}