package cucumber.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Reporter;
import utilities.ThreadLocalDriver;

public class WikiHomePageStepDefinitions extends BaseSteps {
  @Before
  public void setupLoginSteps() {
    if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Mobile")) {
      setupScreens(ThreadLocalDriver.getAppiumDriverThreadLocal());
    } else {
      setupScreensOnline(ThreadLocalDriver.getRemoteWebDriverThreadLocal());
    }
  }

  @Given("User is on Wiki home page")
  public void userIsOnBSHomePage() {
    wikiHomePage.userOnWikiHomePage();
  }

  @When("User clicks History Two")
  public void userClicksButton() {
    wikiHomePage.clickHistoryElement();
  }

  @And("User clicks on Nearby Three")
  public void userClicksOnButtonA() {
    wikiHomePage.clickNearbyElement();
  }

  @And("User clicks on Wiki Explore Four")
  public void userClicksOnButtonB() {
    wikiHomePage.clickExploreElement();
  }

  @Then("Verify InTheNewsTitle")
  public void verifyButton() {
    wikiHomePage.assertInTheNewsTitleIsAsExpected();
  }

  @When("User clicks List One")
  public void userClicksList() {
    wikiHomePage.clickListElement();
  }

  @When("User clicks WebView")
  public void userClicksWebView() {
    wikiHomePage.webViewClick();
  }

  @Then("WebView page should be displayed")
  public void webviewPageShouldBeDisplayed() {
    wikiHomePage.verifyWebViewHeader();
  }
}
