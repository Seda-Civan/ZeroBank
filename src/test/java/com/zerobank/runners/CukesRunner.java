package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "com/zerobank/stepdefinitions",
        features = "src/test/resources/features",
        dryRun = false,
        strict = false,
        tags = "@account_activity",
        //command + shift + f => to deep search where tags (activities) is used
        plugin = {
                "html:target/default-report ",
                "json:target/cucumber1.json",
                //generate list of scenarios that failed during test execution
                "rerun:target/rerun.txt"
        }
)
public class CukesRunner {

}
