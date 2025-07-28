package cucumber.azure.devops.hooks;

import cucumber.azure.devops.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.sql.Timestamp;

import static cucumber.azure.devops.factory.DriverFactory.cleanUpDriver;
import static cucumber.azure.devops.factory.DriverFactory.getDriver;

public class CucumberHooks {
    private static WebDriver driver;
    @Before
    public static void setUP(Scenario scenario){
        System.out.println(scenario.getName());
        getDriver();
    }

    @AfterStep
    public void captureExceptionImageAfterStep(Scenario scenario){
        if (scenario.isFailed()){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            String timeMilliseconds = Long.toString(timestamp.getTime());
            byte[] screenshot = ((TakesScreenshot)getDriver())
                    .getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png",timeMilliseconds);

        }

    }
    @After
    public static void tearDown(Scenario scenario){
        System.out.println(scenario.getName() + "  " + scenario.getStatus());
        cleanUpDriver();
    }
}
