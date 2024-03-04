package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class UnableToRemoveCoreLink_CONVOY extends TestDriverActions {

   // @FindBy(xpath = "(//span[text()='Part #']/parent::div/parent::th/parent::tr/following::div/table/tbody/tr/td/span/child::a)[1]")

     @FindBy(xpath = "//h2[text()='Part List']")
     WebElement PartList;

     @FindBy(xpath = "//span[text()='Part #']")
     WebElement PartHash1;

     @FindBy(xpath = "//span[text()='Description']")
     WebElement Description;

     @FindBy(xpath = "//span[text()='Preferred Vendor']")
     WebElement PreferredVendor;

     @FindBy(xpath = "//span[text()='Manufacturer']")
     WebElement Manudactuer;

     @FindBy(xpath = "//span[text()='VMRS SYS/ASM']")
     WebElement VMRSSYS;

     @FindBy(xpath = "//span[text()='Vendor Catalog']")
     WebElement vendorCatalog;

     @FindBy(xpath = "//span[text()='Product Group']")
     WebElement ProductGroup;

   @FindBy(xpath = "//tr[@role='row']/td[1]")
   List<WebElement> PartNumber;

    @FindBy(xpath = "//a[contains(.,'More Info')]/span")
    WebElement moreInfo;

    @FindBy(xpath = "//td[contains(@id,':0:pw3::tb')]/child::div")
    WebElement label_Title;

    @FindBy(xpath = "//label[contains(text(),'Default Preferred Vendor:')]")
    WebElement DefaultPreferredVendor;

    @FindBy(xpath = "//label[text()='Default Preferred Vendor:']/parent::td/following-sibling::td")
    WebElement DefaultPreferredVendorValue;

    @FindBy(xpath = "(//label[text()='Product Group:']/preceding-sibling::span)[2]")
    WebElement label_RequiredProductGroup;

    @FindBy(xpath = "(//label[text()='Product Group:'])[3]")
    WebElement label_ProductGroup;

    @FindBy(xpath = "(//select[contains(@id,':0:soc3::content')])[2]")
    WebElement selectdropdown;

    @FindBy(xpath = "//label[text()='Core Part #:']")
    WebElement CorePart;

    @FindBy(xpath = "//label[text()='Core Part #:']/parent::td/following-sibling::td/child::a")
    WebElement label_SelectCorePart;

    @FindBy(xpath = "//label[contains(text(),'Create New Core Part')]/preceding-sibling::input")
    WebElement RadioButton;

    @FindBy(xpath = "//label[contains(text(),'Create New Core Part')]")
    WebElement CreateNewCorePart;

    @FindBy(xpath = "(//label[text()='Part #:']/preceding-sibling::span)[3]")
    WebElement RequiredPart;

    @FindBy(xpath = "(//label[text()='Part #:'])[3]")
    WebElement partHash;

    @FindBy(xpath = "(.//label[text()='Part #:']/parent::td/following-sibling::td/child::input)[2]")
    WebElement PartValue;


    @FindBy(xpath = "(//label[text()='Description:']/preceding-sibling::span)[3]")
    WebElement RequiredDescription;

    @FindBy(xpath = "(//label[text()='Description:'])[3]")
    WebElement Description1;

    @FindBy(xpath = "(//label[text()='Description:']/parent::td/following-sibling::td/child::input)[2]")
    WebElement DescriptionValue;

    @FindBy(xpath = "//label[text()='Standard Cost:']/preceding-sibling::span")
    WebElement RequiredStandardCost;

    @FindBy(xpath = "//label[text()='Standard Cost:']")
    WebElement StandardCost;

    @FindBy(xpath = "//label[text()='Standard Cost:']/parent::td/following-sibling::td/child::input")
    WebElement StandardCostValue;

    @FindBy(xpath = "//label[text()='Last Purchase Cost:']/preceding-sibling::span")
    WebElement RequiredLastPurchaseCost;


    @FindBy(xpath = "//label[text()='Last Purchase Cost:']")
    WebElement LastPurchaseCost;

    @FindBy(xpath = "//label[text()='Last Purchase Cost:']/parent::td/following-sibling::td/child::input")
    WebElement LastPurchaseCostTextArea;

    @FindBy(xpath = "//label[contains(text(),'Retail Markup')]")
    WebElement RetailMaekup;

    @FindBy(xpath = "//label[contains(text(),'Retail Markup')]/parent::td/following-sibling::td/child::input")
    WebElement RetailMarkupTextArea;

    @FindBy(xpath = "//label[text()='Retail Price:']")
    WebElement RetailPrice;

    @FindBy(xpath = "//label[text()='Retail Price:']/parent::td/following-sibling::td/child::input")
    WebElement RetailPriceTextArea;

    @FindBy(xpath = "//span[text()='Link Core']")
    WebElement LinkCore;

    @FindBy(xpath ="(//a[contains(.,'Cancel')])[3]")
    WebElement Cancel;


    @FindBy(xpath = "//span[text()='Delink Core']")
    WebElement DelinkCore;

    @FindBy(xpath = "(//a[contains(.,'Cancel')]/span)[3]")
    WebElement CancelButton;


    @FindBy(xpath = "//span[text()='Save / Exit']")
    WebElement SaveExit;

    @FindBy(xpath = "//span[text()='Add New Adjustment']")
    WebElement AddNewAdjustment;

    @FindBy(xpath = "(//td[contains(.,'Select Warehouse')])[2]")
    WebElement SelectWarehouse;

    @FindBy(xpath = "(//label[text()='Warehouse:']/preceding-sibling::span)[2]")
    WebElement RequiredWarehouse;

    @FindBy(xpath = "(//label[text()='Warehouse:'])[2]")
    WebElement Warehouse;

    @FindBy(xpath = "//label[text()='Warehouse:']/parent::td/following-sibling::td/child::select")
    WebElement WarehouseTextArea;

    @FindBy(xpath = "(//span[text()='OK'])[1]")
    WebElement okButton;

    @FindBy(xpath = "(//span[text()='Cancel'])[2]")
    WebElement Cancel2;

    @FindBy(xpath = "//span[contains(@id,'it1::content')]")
    WebElement WarehouseValue;

    @FindBy(xpath = "//label[text()='Adjustment Type:']/preceding-sibling::span")
    WebElement RequiredAdjustmentTye;

    @FindBy(xpath = "(//label[text()='Adjustment Type:'])[3]")
    WebElement AdjustmentType;

    @FindBy(xpath = "//label[text()='Part #:']")
    WebElement partHash1;

    @FindBy(xpath = "//label[text()='Part #:']/parent::td/following-sibling::td/child::input")
    WebElement PartTextArea;

    @FindBy(xpath = "(//label[text()='Quantity:'])[1]")
    WebElement Quantity1;

    @FindBy(xpath = "//label[text()='Quantity:']/parent::td/following-sibling::td/child::table")
    WebElement QuantityTextArea;

    @FindBy(xpath = "//a[contains(.,'Add Part')]")
    WebElement AddPart;

    @FindBy(xpath = "//label[text()='Part Description:']")
    WebElement PartDescription;

    @FindBy(xpath = "//label[text()='Part Description:']/following::td[1]")
    WebElement PartDescribtionValue;

    @FindBy(xpath = "//label[text()='On Hand  (EA):']/following::td[1]")
    WebElement OnHandvalue;

    @FindBy(xpath = "//label[text()='On Hand  (EA):']")
    WebElement OnHandEA;

    @FindBy(xpath = "//span[text()='Adjust Inventory']")
    WebElement AdjustInventory;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;


 /**
  * Click on Parts
  * click on Part Master
  */
 public static void gotoCounterSaleManagerScreen() throws FileNotFoundException, InterruptedException {
  ReusableActions.getActions().clickParentMenu("Parts");
  ReusableActions.getActions().clickChildMenu("Part Master");

  TestListener.saveScreenshotPNG(driver);
 }
 /**verify Part List*/
 public void verifyPartList () throws InterruptedException {
  WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PartList);
  Assert.assertTrue(PartList.isDisplayed());
  Assert.assertTrue(PartHash1.isDisplayed());
  Assert.assertTrue(Description.isDisplayed());
  Assert.assertTrue(PreferredVendor.isDisplayed());
  Assert.assertTrue(Manudactuer.isDisplayed());
  Assert.assertTrue(VMRSSYS.isDisplayed());
  Assert.assertTrue(vendorCatalog.isDisplayed());
  Assert.assertTrue(ProductGroup.isDisplayed());

 }









 /**go to part Master*/
   public void clickonPartNumber () {


   }


























}
