package com.aexp.browsertest.page;

import com.aexp.browsertest.core.ThreadLocalManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import static org.testng.AssertJUnit.assertTrue;

/**
 * This class model the Cucumber Training BDD  page
 */
public class CucumberBDDTrainingPage extends LoadableComponent<CucumberBDDTrainingPage> {

  // Page Variables
  private String baseURL = "https://cucumber.io/training";
  private WebDriver driver;
  private WebDriverWait wait;
  private BasePage basePage;

  public CucumberBDDTrainingPage() {

    this.driver = ThreadLocalManager.getBrowser().getDriver();
    this.wait = new WebDriverWait(driver, 10);
    basePage = new BasePage(this.driver);
  }

  @Override
  protected void load() {
    this.driver.get(baseURL);

  }

  @Override
  protected void isLoaded() throws Error {

    assertTrue("HomePage is not loaded!", driver.getCurrentUrl().contains(baseURL));

  }


  /**
   * Method used to verify if the user is in the Cucumber's Training BDD page
   */
  public void ThenIVerifyIamInTheTrainingBDDPage() {

    Assert.assertTrue(driver.getCurrentUrl().contains(baseURL));

  }


}
