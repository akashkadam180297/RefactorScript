package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;

public class SuggestedOrderReportRestockorReorder extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(.,'Suggested Orders')])[1]")
    WebElement SuggestedOrders;

    @FindBy(xpath = "//h1[text()='Restocks']")
    WebElement Restocks;

    @FindBy(xpath = "//span[text()='Part #']")
    WebElement PartHash;

    @FindBy(xpath = "//span[text()='Vendor Part #']")
    WebElement vendorPartHash;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement Description;

    @FindBy(xpath = "//span[text()='Suggested Quantity']")
    WebElement SuggestedQuantity;

    @FindBy(xpath = "//span[text()='Quantity to Order']")
    WebElement QuantitytoOrder;

    @FindBy(xpath = "//span[text()='UOM']")
    WebElement UOM;

    @FindBy(xpath = "//span[text()='Stock UOM']")
    WebElement StockUOM;

    @FindBy(xpath = "//span[text()='Conv']")
    WebElement Conv;


   @FindBy(xpath = "//span[text()='Unit Cost']")
    WebElement UnitCost;
    @FindBy(xpath = "//label[text()='Search:']/parent::td/following-sibling::td/child::input")
    WebElement SearchTextArea;

    @FindBy(xpath = "//span[text()='Refresh']")
    WebElement btn_refresh;

    @FindBy(xpath = "//span[text()='Active']/following::td[1]/span/a")
    WebElement hyperlink_partNumber;

   @FindBy(xpath = "//span[text()='Part #']//parent::div/parent::th/parent::tr/th[11]/following::div/table/tbody/tr/td[2]/child::span")
    WebElement PartValue;

     @FindBy(xpath = "//span[text()='Submit / Print PO']")
    WebElement SubmitPrintPO;


     @FindBy(xpath = "//span[text()='Edit PO']")
    WebElement EditPO;

     @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement SaveExit;

     @FindBy(xpath = "(//span[text()='Print List'])[3]")
      WebElement PrintList;

     @FindBy(xpath = "(//span[text()='Cancel'])[1]")
     WebElement Cancel;

    /**goto order parts Screen*/
    public void gotoOrderPartsScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Parts");
        ReusableActions.getActions().clickChildMenu("Order Parts");
        TestListener.saveScreenshotPNG(driver);

    }
    /**click on Suggested Orders*/
    public void clickOnSuggestedOrders () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SuggestedOrders);
        WebElementActions.getActions().clickElement(SuggestedOrders);
        TestListener.saveScreenshotPNG(driver);

    }









}
