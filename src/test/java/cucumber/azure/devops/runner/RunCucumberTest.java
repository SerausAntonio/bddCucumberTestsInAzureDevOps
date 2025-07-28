package cucumber.azure.devops.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(features = {"classpath:features"}, glue = {"cucumber/azure/devops/stepDefinitions"},
        tags="",monochrome = false, dryRun = false,
        plugin ={"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class RunCucumberTest extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
