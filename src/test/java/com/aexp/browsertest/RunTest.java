package com.aexp.browsertest;

import com.aexp.browsertest.model.Browser;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

@CucumberOptions(glue = "com.aexp.browsertest",tags = "not @mock" ,plugin = {"json:target/json-cucumber-reports/cukejson.json",
  "testng:target/testng-cucumber-reports/cuketestng.xml" }, features = "src/test/resources/com/aexp/browsertest/")
public class RunTest extends AbstractTestNGCucumberTests {

  public static ThreadLocal<Browser> browsers = new ThreadLocal<>();


  @Parameters({"browser", "os", "version"})
  @BeforeClass
  public void setUP(String browser, String so, String version) {


    browsers.set(new Browser(browser, so, version));

  }

  @AfterClass
  public void tearDown() {
    browsers.get().closeBrowser();
  }
}
