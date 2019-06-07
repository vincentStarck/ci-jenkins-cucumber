package com.aexp.browsertest.page;

/**
 * Class used to invoke the page generation method of PageManager
 */
public class Page extends PageManager{



  public synchronized HomePage homePage() {

    return createPage("homePage", HomePage.class);
  }

  public synchronized LoginPage loginPage() {

    return createPage("loginPage", LoginPage.class);
  }
  public synchronized CucumberHomePage cucumberHomePage() {

    return createPage("cucumberHomePage", CucumberHomePage.class);
  }

  public synchronized CucumberBDDTrainingPage cucumberBDDTrainingPage() {
    return createPage("cucumberBDDTrainingPage", CucumberBDDTrainingPage.class);
  }


}