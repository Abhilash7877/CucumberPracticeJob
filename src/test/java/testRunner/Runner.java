package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"D:\\practice\\Cucumber_Project\\FeatureFiles\\Login.feature"},tags= {"@Loginwithsingledata"},
glue= {"stepDefinations"},
plugin =
{"com.cucumber.listener.ExtentCucumberFormatter:Reports/report.html","pretty",
"html:target/cucumber-reports"},monochrome = true)
public class Runner {

}
