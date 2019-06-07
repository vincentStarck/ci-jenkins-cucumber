package com.aexp.browsertest.page;

import com.aexp.browsertest.core.ThreadLocalManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.LoadableComponent;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.testng.AssertJUnit.assertTrue;

/**
 * This Class model the Cucumber Home page
 */
public class CucumberHomePage extends LoadableComponent<CucumberHomePage> {

  // Page Variables
  private String baseURL = "https://cucumber.io/";
  private WebDriver driver;
  private WebDriverWait wait;
  private BasePage basePage;

  public CucumberHomePage() {

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
   * Button for go the Cucumber's Training BDD page
   */
  By learnBDDButton = By.xpath("//*[@id=\"block-yui_3_17_2_1_1533375529341_8854\"]/div/div/a");


  /**
   * Method used to redirect to the Cucumber's Training BDD page
   */
  public void goToBDDLearningPage() {

    wait.until(ExpectedConditions.visibilityOfElementLocated(learnBDDButton));
    basePage.click(learnBDDButton);

  }


}
