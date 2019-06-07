package com.aexp.browsertest.stepsdef;

import com.aexp.browsertest.page.Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class TestRedirectCucumberTraingPageDef {


  private Page page;

  public TestRedirectCucumberTraingPageDef(Page page) {
    this.page = page;

  }

  @Given("I am in the  home page cucumber.io")
  public void i_am_in_the_home_page_cucumber_io() {

    this.page.cucumberHomePage();

  }

  @When("I do click to the button learn behavior driver development")
  public void i_do_click_to_the_button_learn_behavior_driver_development() {


    page.cucumberHomePage().goToBDDLearningPage();
  }

  @Then("I Should be redirect to  the BDD training page")
  public void i_Should_be_redirect_to_the_BDD_training_page() {

    this.page.cucumberBDDTrainingPage().ThenIVerifyIamInTheTrainingBDDPage();
  }


}
