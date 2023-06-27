package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utilities.CommonFunctions;
import utilities.ThreadLocalDriver;

import java.util.HashSet;

public class LocalOnlineMyntraHomePage {
    public LocalOnlineMyntraHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    CommonFunctions commonFunctions=new CommonFunctions();
    /**
     * Mobile Elements
     */
    @FindBy(xpath = "//*[text()='Women']")
    WebElement womenCategoryButton;

    public WebElement getWomenCategoryButton() {
        return womenCategoryButton;
    }

    @FindBy(xpath = "//*[text()='Kids']")
    WebElement kidsCategoryButton;

    public WebElement getKidsCategoryButton()
    {
      return kidsCategoryButton;
    }

    @FindBy(xpath = "//*[text()='Men']")
    WebElement menCategoryButton;

    public WebElement getMenCategoryButton()
    {
        return menCategoryButton;
    }

    @FindBy(xpath = "(//*[text()='Jeans'])[1]")
    WebElement jeansCategory;

    public WebElement getjeansCategory()
    {
        return jeansCategory;
    }

    @FindBy(xpath = "(//*[text()='Flying Machine'])[1]")
    WebElement flyingMachine;

    public WebElement getFlyingMachine()
    {
        return flyingMachine;
    }

    @FindBy(xpath = "(//*[text()='Flying Machine'])[3]")
    WebElement verifyJeansBrand;

    public WebElement getVerifyJeansBrand() {
        return verifyJeansBrand;
    }

    @FindBy(xpath="//*[@class='desktop-searchBar']")
    WebElement searchInputBox;
    public WebElement getSearchInputBox(){
        return searchInputBox;
    }

    @FindBy(xpath="(//*[contains(@class,'iconSearch')])[1]")
    WebElement searchIcon;
    public WebElement getSearchIcon(){
        return searchIcon;
    }

    @FindBy(xpath ="//*[@class='img-responsive']")
    WebElement firstProduct;
    public WebElement getFirstProduct(){
        return firstProduct;
    }

    @FindBy(xpath ="(//*[text()='Men'])[2]")
    WebElement menRadioButton;
    public WebElement getMenRadioButton(){
        return menRadioButton;
    }

    @FindBy(xpath="(//*[text()='Casual Shoes'])[4]")
    WebElement casualShoesCheckBox;
    public WebElement getCasualShoesCheckBox() {
        return casualShoesCheckBox;
    }

    @FindBy(xpath ="(//*[text()='Puma'])[1]")
    WebElement pumaCheckBox;
    public WebElement getPumaCheckBox() {
        return pumaCheckBox;
    }

    @FindBy(xpath = "(//*[@class='common-customCheckbox vertical-filters-label'])[3]")
    WebElement priceRangeCheckBox;
    public WebElement getPriceRangeCheckBox() {
        return priceRangeCheckBox;
    }

    @FindBy(xpath = "(//*[@class='colour-label colour-colorDisplay'])[1]")
    WebElement colorCheckBox;
    public WebElement getColorCheckBox() {
        return colorCheckBox;
    }

    @FindBy(xpath ="(//*[@class='common-customRadio vertical-filters-label'])[1]")
    WebElement discountRadioButton;
    public WebElement getDiscountRadioButton()
    {
        return discountRadioButton;
    }

    @FindBy(xpath ="(//*[@class='img-responsive'])[1]")
    WebElement firstProductimg;
    public WebElement getFirstProductimg()
    {
        return firstProductimg;
    }

    @FindBy(xpath ="//*[text()='8']")
    WebElement sizeButton;
    public WebElement getSizeButton()
    {
        return sizeButton;
    }

    @FindBy(xpath ="//*[text()='ADD TO BAG']")
    WebElement addtoBagButton;
    public WebElement getAddtoBagButton()
    {
        return addtoBagButton;
    }

    @FindBy(xpath = "//*[text()='GO TO BAG']")
    WebElement gotoBagButton;
    public WebElement getGotoBagButton()
    {
        return gotoBagButton;
    }

    @FindBy(xpath = "//*[text()='PLACE ORDER']")
    WebElement placeorder;
    public WebElement getPlaceorder()
    {
        return placeorder;
    }

    /**
     * Actions
     */
    public void clickStudio() {
        getKidsCategoryButton().click();
//    test.get().log(Status.INFO, "Clicked Studio", MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenshotAsBase64Online()).build());
    }

    public void clickCategories() {
        getWomenCategoryButton().click();
//    test.get().log(Status.INFO, "Clicked Home", MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenshotAsBase64OnlineLocal()).build());
    }

    public void userOnHomePage()
    {
        ThreadLocalDriver.getWebDriverThreadLocal().get("https://www.myntra.com/");
        ThreadLocalDriver.getWebDriverThreadLocal().manage().window().maximize();
//      test.get().log(Status.INFO, "Home Page", MediaEntityBuilder.createScreenCaptureFromBase64String(takeScreenshotAsBase64OnlineLocal()).build());
    }

    /*public void userclickonMenPage()
    {
        getMenCategoryButton().click();
    }*/
    public void hoverOnMenAndClicksonJeans()
    {
        Actions actions=new Actions(ThreadLocalDriver.getWebDriverThreadLocal());
        actions.moveToElement(getMenCategoryButton()).build().perform();
        actions.moveToElement(getjeansCategory()).click().build().perform();
    }

    public void userFiltersOnFLyingMachineBrandPage()
    {
        getFlyingMachine().click();
    }

    public void verifyJeansBrandFlyingMachinePage()
    {
        String s="flying Machine";
        String s1=getVerifyJeansBrand().getText();
        Assert.assertTrue(s.equalsIgnoreCase(s1),"Flying machine verified");
    }

    public void enterTextInSearchInputBox(String searchText)
    {
        getSearchInputBox().sendKeys(searchText);
    }
    public void clickSearchIcon()
    {
        getSearchIcon().click();
    }
    public void verifyItemsDisplayed()
    {
        Assert.assertTrue(getFirstProduct().isDisplayed(),"Products are available");
    }
    public void filter() throws InterruptedException {
        getMenRadioButton().click();
        Thread.sleep(2000);
        getCasualShoesCheckBox().click();
        Thread.sleep(2000);
        getPumaCheckBox().click();
        Thread.sleep(2000);
        commonFunctions.scrollWebPage();
        Thread.sleep(15000);
        getPriceRangeCheckBox().click();
        Thread.sleep(2000);
        commonFunctions.scrollWebPage();
        //Scroll after price to be done
        Thread.sleep(2000);
        getColorCheckBox().click();
        commonFunctions.scrollWebPage();
        commonFunctions.scrollWebPage();
        Thread.sleep(2000);
        commonFunctions.scrollWebPage();
        getDiscountRadioButton().click();
    }
    public void firstProductClick()
    {
        getFirstProductimg().click();
        //switch window handles
    }

    public void getWindowTabs(){
        String parentWindowHandle=ThreadLocalDriver.getWebDriverThreadLocal().getWindowHandle();
        HashSet<String> windowHandles=new HashSet<>();
        windowHandles= (HashSet<String>) ThreadLocalDriver.getWebDriverThreadLocal().getWindowHandles();
        for(String i:windowHandles )
        {
            ThreadLocalDriver.getWebDriverThreadLocal().switchTo().window(i);
        }
    }


    public void addToBag() throws InterruptedException {
        getWindowTabs();
        getSizeButton().click();
        getAddtoBagButton().click();
        Thread.sleep(2000);
        getGotoBagButton().click();
    }

    public void verifyAddToBag()
    {
        Assert.assertTrue(getPlaceorder().isDisplayed(),"Added to Bag for Placing Order");
    }

}
