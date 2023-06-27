package cucumber.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Reporter;
import utilities.CommonFunctions;
import utilities.ThreadLocalDriver;

/**
 * this class contains java implementation for steps in feature files
 */
public class MyntraHomePageStepDefinitions extends BaseSteps {

    @Before
    public void setupLoginSteps() {
        if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Mobile")) {
            setupScreens(ThreadLocalDriver.getAppiumDriverThreadLocal());
        } else if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Online")) {
            setupScreensOnline(ThreadLocalDriver.getRemoteWebDriverThreadLocal());
        } else {
            setupScreensOnlineLocal(ThreadLocalDriver.getWebDriverThreadLocal());
        }
    }

    @Given("User is on home page")
    public void userisonhomepageandtapsCategories() {
        if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Mobile")) {
            myntraHomePage.userOnHomePage();
        } else if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Online")) {
            onlineMyntraHomePage.userOnHomePage();
        } else {
            localOnlineMyntraHomePage.userOnHomePage();
        }
    }

    @When("User clicks Studio {int} Two")
    public void userclicksStudio(int index) {
        if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Mobile")) {
            myntraHomePage.clickStudio();
        } else {
            onlineMyntraHomePage.clickStudio();
        }
    }

    @When("User clicks on Categories One")
    public void userClicksOnCategories() {
        if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Mobile")) {
            myntraHomePage.clickCategories();
        } else if (Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("OnlineOrMobile").equalsIgnoreCase("Online")) {
            onlineMyntraHomePage.clickCategories();
        } else {
            localOnlineMyntraHomePage.clickCategories();
        }
    }

    @Then("Verify Explore button")
    public void verifyExplorebutton() {
        myntraHomePage.assertExploreTitleIsExpected();
    }

    @When("User clicks on Profile Four")
    public void userClicksOnProfile() {
        myntraHomePage.clickProfile();
    }

    @And("User clicks on Home Five")
    public void userClicksOnHome() {
        myntraHomePage.clickHome();
    }

    @When("User clicks on Explore Three")
    public void userClicksOnExplore() {
        myntraHomePage.clickExplore();
    }


    @When("User hovers on Men and clicks on Jeans")
    public void userHoversOnMenAndClicksOnJeans() {
        localOnlineMyntraHomePage.hoverOnMenAndClicksonJeans();
    }

/*

    @When("User clicks on Jeans")
    public void userClicksOnJeans() throws InterruptedException {
        CommonFunctions commonFunctions = new CommonFunctions();


        for (int i = 0; i < 6; i++) {
            if (ThreadLocalDriver.getWebDriverThreadLocal().findElements(By.xpath("//*[contains(@src,'Jeans')]")).size() == 0) {
                commonFunctions.scrollWebPage();
                Thread.sleep(2000);
            } else break;
        }


        localOnlineMyntraHomePage.userClicksonJeansPage();
    }
*/

    @And("User filters on FLying Machine brand")
    public void userFiltersOnFLyingMachineBrand() {
        localOnlineMyntraHomePage.userFiltersOnFLyingMachineBrandPage();
    }

    @Then("Verify Jeans brand Flying Machine")
    public void verifyJeansBrandFlyingMachine() {
        localOnlineMyntraHomePage.verifyJeansBrandFlyingMachinePage();
    }


    @And("clicks on search icon")
    public void clicksOnSearchIcon() {
        localOnlineMyntraHomePage.clickSearchIcon();
    }

    @Then("products should be displayed")
    public void productsShouldBeDisplayed() {
        localOnlineMyntraHomePage.verifyItemsDisplayed();
    }

    @When("User filters search results")
    public void userFiltersSearchResults() throws InterruptedException {
        localOnlineMyntraHomePage.filter();
    }

    @And("clicks first product")
    public void clicksFirstProduct() {
        localOnlineMyntraHomePage.firstProductClick();
    }

    @And("adds it to cart")
    public void addsItToCart() throws InterruptedException {
        localOnlineMyntraHomePage.addToBag();
    }

    @Then("product should be added to cart")
    public void productShouldBeAddedToCart() {
        localOnlineMyntraHomePage.verifyAddToBag();
    }

    /*
    @When("User enters <{string}> in searchbox")
    public void userEntersInSearchbox(String arg0) {
        localOnlineMyntraHomePage.enterTextInSearchInputBox(arg0);
    }
*/

    @When("User enters {string} in searchbox")
    public void userEntersInSearchbox(String arg0) {
        localOnlineMyntraHomePage.enterTextInSearchInputBox(arg0);
    }
}