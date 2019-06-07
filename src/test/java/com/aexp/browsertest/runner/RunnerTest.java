package com.aexp.browsertest.runner;

import com.aexp.browsertest.core.LocalDriverFactory;
import com.aexp.browsertest.model.Browser;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


@CucumberOptions( tags = "not @mock", glue = "com.aexp.browsertest.stepsdef", plugin = {"json:target/json-cucumber-reports/cukejson.json",
  "testng:target/testng-cucumber-reports/cuketestng.xml"}, features = "src/test/resources/features", monochrome = true)
public class RunnerTest extends AbstractTestNGCucumberTests {


  @Parameters({"browser", "os", "version"})
  @BeforeClass
  public void setUP(String browser, String so, String version) {

    System.out.println("BeforeMethod is started. " + Thread.currentThread().getId());

    LocalDriverFactory.SetBrowser(new Browser(browser, so, version));
  }


}


