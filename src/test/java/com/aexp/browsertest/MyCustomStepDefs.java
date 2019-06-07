package com.aexp.browsertest;

import com.aexp.browsertest.core.CucumberManager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MyCustomStepDefs extends CucumberManager {
  @Given("A browser open with {string}")
  public void open(String string) {

    Assert.assertTrue(super.interpret(RunTest.browsers.get(), string));

  }

  @When("I find My Account link")
  public void find() {
    Assert.assertTrue(super.interpret(RunTest.browsers.get()));
  }

  @Then("I should see {string}")
  public void validate(String string) {
    Assert.assertTrue(super.interpret(RunTest.browsers.get(), string));
  }

}
