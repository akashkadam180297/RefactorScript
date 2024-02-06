package pages.Partsrelateditems;

import actions.ReusableActions;
import actions.WaitActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class Add_a_fabricatedpart_to_a_closed_workorder extends TestDriverActions {


    @FindBy(xpath = "//a[contains(.,'New RO')]")
    WebElement NewRo;

    @FindBy(xpath = "//label[text()='Search Unit:']/parent::span/child::input")
    WebElement SerachUnit;

    @FindBy(xpath = "//a[contains(.,'Select')]")
    WebElement Select;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    public  WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public  WebElement label_VMRS;

    @FindBy(xpath = "//img[@title='Accessories Group']")
    public WebElement label_AccessoriesGroup;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddButton;


    @FindBy(xpath = "(//div[contains(@id,':tParts::db')]//table//div//a/child::span[contains(@id,'::text')])[1]")
    public WebElement label_PartsSrNo;

    @FindBy(xpath = "//span[text()='Add Parts']")
    public WebElement label_AddPart;

    @FindBy(xpath = "//img[contains(@id,':tWa:0:vmrImage')]")
    public WebElement label_Img;

    @FindBy(xpath = "//a[contains(@id,'0:clPartsStockOnHand')]")
    public WebElement label_PartName;

    @FindBy(xpath = "//input[contains(@id,':itSearchPartSelect::content')]")
    public WebElement txt_PartTextArea;

    @FindBy(xpath = "//li[contains(@id,':itSearchPartSelect::su0')]")
    public WebElement label_PartNumber;

    @FindBy(xpath = "//span[text()='Issue Part']")
    public WebElement btn_IssuePartBtn;


    @FindBy(xpath = "//div[contains(@id,':ocb1:ctbClose')]//child::a/span[text()='Close']")
    public WebElement btn_Close;

    @FindBy(linkText = "Close RO")
    WebElement closeRO;

    @FindBy(xpath = "//label[contains(.,'Invoiced')]/preceding-sibling::input")
    WebElement Invoiced;

    @FindBy(xpath = "//input[contains(@id,':itSearch::content')]")
    WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(.,'Refresh')]")
    WebElement Refresh;


    @FindBy(xpath = "(//a[contains(text(),'O0')])[1]")
    WebElement label_ReferenceNumber;

    @FindBy(xpath = "//a[contains(.,'Delete Customer Invoice')]")
    WebElement invoiceDelete;

    @FindBy(xpath = "//textarea[contains(@id,':itINotes::content')]")
    WebElement DeleteCustomerivoice;

    @FindBy(xpath = "(//a[contains(.,'Delete Customer Invoice')])[2]")
    WebElement DeleteCustomerinvoiceButton;


    @FindBy(xpath = "(//label[text()='RO#:']/parent::span/following::div)[1]")
     WebElement FabricatedParts;

    @FindBy(xpath = "(//span[contains(text(),'Total Cost')])[2]")
    WebElement TotalCost;

    @FindBy(xpath = "(//span[text()='Total Charge'])[2]")
    WebElement TotalCharges;

    @FindBy(xpath = "//label[text()='Part #:']")
    public WebElement label_Part;

    @FindBy(xpath = "(//label[text()='Part #:']/parent::span/following::div)[1]")
    public WebElement label_PartTextArea;

    @FindBy(xpath = "//label[text()='Part Description:']")
    public WebElement label_PartDescription;

    @FindBy(xpath = "(//label[text()='Part Description:']/following::div)[1]")
    public WebElement label_PartDescriptionTextArea;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']")
    public WebElement label_ChargeQuantity;

    @FindBy(xpath = "//label[text()='Charge Quantity (EA):']/parent::span/parent::div/following-sibling::div/child::table//div//input")
    public WebElement label_ChargeQuantityTextArea;

   @FindBy(xpath = "//label[text()='Unit Cost:']")
    WebElement label_unitCost;

   @FindBy(xpath = "(//label[text()='Unit Cost:']/parent::span/following::div)[1]")
    WebElement UnitCost;

    @FindBy(xpath = "(//div[contains(@id,'pslStockOnHand::b')]//a//span)[1]")
    public WebElement label_CancelButton;

    @FindBy(xpath = "//div[contains(@id,':0:rPOH:1:cb2')]//a//span")
    public WebElement label_OkButton;

    @FindBy(xpath = "//a[contains(.,'New Part')]")
    WebElement NewPart;

    @FindBy(xpath = "//td[contains(@id,':pwPQ::tb')]/child::div")
    WebElement NewPart1;

    @FindBy(xpath = "(//label[text()='Part #:']/preceding-sibling::span)[2]")
    WebElement RequiredPart;

    @FindBy(xpath = "(//label[text()='Part #:']/parent::span)[2]")
    WebElement PartTextArea;


    @FindBy(xpath = "//label[text()='Part #:']")
    WebElement PartHash;

    @FindBy(xpath = "//label[text()='Description:']/preceding-sibling::span")
    WebElement DescriptionRequired;

    @FindBy(xpath = "//label[text()='Description:']")
    WebElement Description;

    @FindBy(xpath = "(//label[text()='Description:']/parent::span)[2]")
    WebElement DescriptionTextArea;

    @FindBy(xpath = "(//label[text()='Stocking UOM:'])[1]")
    WebElement StockingUOM;

    @FindBy(xpath = "(//label[text()='Stocking UOM:']/parent::span)[2]")
    WebElement StockingUOMTextArea;

    @FindBy(xpath = "//label[text()='Stocking UOM:']/preceding-sibling::span")
    WebElement StockingUOMRequired;

    @FindBy(xpath = "//label[contains(.,'Stock Part')]")
    WebElement StockPart;

    @FindBy(xpath = "//label[text()='Product Group:']/preceding-sibling::span")
    WebElement ProductGroupRequired;

    @FindBy(xpath ="//label[text()='Product Group:']")
    WebElement ProductGroup;

    @FindBy(xpath = "(//label[text()='Product Group:']/parent::span)[2]")
    WebElement  ProductGroupTextArea;

    @FindBy(xpath = "//label[text()='Cost:']/preceding-sibling::span")
    WebElement CostRequired;

    @FindBy(xpath = "//label[text()='Cost:']")
    WebElement cost;

    @FindBy(xpath = "(//label[text()='Cost:']/parent::span)[2]")
    WebElement CostTextArea;

    @FindBy(xpath = "//label[text()='Costing Method:']/preceding-sibling::span")
    WebElement CostingMethodRequired;

    @FindBy(xpath = "//label[text()='Costing Method:']")
    WebElement CostingMethod;

    @FindBy(xpath = "(//label[text()='Costing Method:']/parent::span)[2]")
    WebElement CostingMethodTextArea;

    @FindBy(xpath = "(//label[text()='GL Account Group:'])[1]")
    WebElement GLAccoutGroup;

    @FindBy(xpath = "(//label[text()='GL Account Group:']/parent::span)[2]")
    WebElement GLAccoutGroupTextArea;

    @FindBy(xpath = "(//label[text()='Vendor:'])[1]")
   WebElement vendor;

    @FindBy(xpath = "(//label[text()='Vendor:']/parent::span)[2]")
    WebElement VendorTextArea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[2]")
    WebElement CancelButton;

    @FindBy(xpath = "//div[contains(@id,':1:cb5')]/child::a/span")
    WebElement OKButton;

    @FindBy(xpath = "(//div[contains(@id,':tWAP::db')]//table//td//div//a[contains(@id,':clPartsStockOnHand')])[1]")
    public WebElement  txt_PartNumber;

    @FindBy(xpath = "//a[contains(@id,':0:clctwptc')]/span")
    WebElement StoreTotalCharge;

    @FindBy(xpath = "(//label[text()='Part #:'])[2]")
    WebElement Parts;

    @FindBy(xpath = "//label[text()='Total Cost:']")
    WebElement TotalCost1;

    @FindBy(xpath = "//label[text()='Total Charge:']")
    WebElement TotalCharge;

    @FindBy(xpath = "//label[text()='Part #:']/parent::span/following::div[1]")
    WebElement PartNumber;


    @FindBy(xpath = "//label[text()='Part Description:']")
    WebElement PartDescription;

    @FindBy(xpath = "(//label[contains(text(),'Quantity')])[3]")
    WebElement Quantity;

    @FindBy(xpath = "(//label[text()='Unit Cost:'])[2]")
     WebElement UnitCost2;

    @FindBy(xpath = "(//span[text()='Cancel'])[3]")
    WebElement CancelButton3;

    @FindBy(xpath = "//a[text()='Sign Out']")
    public WebElement label_SignOut;

    @FindBy(xpath = "//input[contains(@id,'username::content')]")
    public WebElement label_UserName;

    @FindBy(xpath = "//h1[text()='Working...Please Wait']")
    List<WebElement> loder;


    /**go to complete RO Screen*/
    public void goToCompleteROScreen() throws InterruptedException, FileNotFoundException {
        ReusableActions.getActions().clickParentMenu("Service");
        ReusableActions.getActions().clickChildMenu("Complete RO");
        WaitActions.getWaits().loadingWait(loder);
        TestListener.saveScreenshotPNG(driver);

    }











































}
