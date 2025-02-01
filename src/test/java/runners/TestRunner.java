package runners;

import Base.BaseTest;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterSuite;

   @CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        plugin = {"pretty",
                "html:target/cucumber-reports.html"
        },
        monochrome = true
        )
    public class TestRunner extends AbstractTestNGCucumberTests {
        @AfterSuite
        public void tearDown() {
        BaseTest.tearDown();
    }
    }