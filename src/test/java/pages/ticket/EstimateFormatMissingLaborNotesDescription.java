package pages.ticket;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;
import java.util.List;

public class EstimateFormatMissingLaborNotesDescription extends TestDriverActions {
    String CodeNumber= WebElementActions.getActions().randomAlphaNumeric(10);
    @FindBy(xpath = "(//a[contains(text(),'Invoice Setup')])[1]")
    WebElement InvoiceSetup;

    @FindBy(xpath = "//a[contains(.,'Add')]")
    WebElement Add;

    @FindBy(xpath = "(//a[contains(.,'Select')])[7]")
    WebElement btn_Select;

    @FindBy(xpath = "(//td[contains(.,' [Work Order Estimate]')])[3]")
    WebElement btn_WorkOrderEstimate;

    @FindBy(xpath = "//select[contains(@id,':soc10::content')]")
    WebElement WorkOrderEstimate;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement btn_Cancel;

    @FindBy(xpath = "(//a[contains(.,'OK')])[1]")
    WebElement btn_OK;

    @FindBy(xpath = "(//a[contains(.,'Repair Locations')])[3]")
    WebElement RepairLocation;

    @FindBy(xpath = "//a[contains(.,'New Repair Location')]")
    WebElement NewRepairLocation;

    @FindBy(xpath = "//label[contains(text(),'Code:')]/preceding-sibling::span")
    WebElement RequiredCode;

    @FindBy(xpath = "(//label[contains(text(),'Code:')])[1]")
    WebElement Code;

    @FindBy(xpath = "(//label[contains(text(),'Code:')]/parent::td/following::td/child::input)[1]")
    WebElement CodeTextArea;

    @FindBy(xpath = "//label[text()='Name:']/preceding-sibling::span")
    WebElement RequiredName;

    @FindBy(xpath = "//label[text()='Name:']")
    WebElement Name;

    @FindBy(xpath = "(//label[text()='Name:']/parent::td/following::td/child::input)[1]")
    WebElement NameTextArea;

    @FindBy(xpath = "//h2[contains(text(),'Position Coordinates')]")
    WebElement PositionCoordinates;

    @FindBy(xpath = "//label[contains(text(),'Country:')]")
    WebElement Country;

    @FindBy(xpath = "//label[contains(text(),'Email:')]")
    WebElement Email;

    @FindBy(xpath = "(//label[contains(text(),'Phone ')])[1]")
    WebElement phoneone;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement Cancel;

    @FindBy(xpath = "//a[contains(.,'Create')]")
    WebElement Create;

    @FindBy(xpath = "//a[contains(.,'Save / Exit')]")
    WebElement SaveExit;

    @FindBy(xpath = "(//a[contains(text(),'Repair Estimates In Progress')])[2]")
    WebElement RepairEstimatesInprogress;

    @FindBy(xpath = "(//a[contains(.,'Quick Estimate')])[2]")
    WebElement QuickEstimate;

    @FindBy(xpath = "//h1[contains(.,'New Repair Estimate')]")
    WebElement NewRepairEstimate;

    @FindBy(xpath = "//label[contains(text(),'Search Location:')]")
    WebElement SearchLocation;

    @FindBy(xpath = "//label[contains(text(),'Search Location:')]/parent::td/following::td/child::table/tbody/tr/td/span/child::input")
    WebElement SearchLocationTextArea;

    @FindBy(xpath = "//span[text()='Name']")
    WebElement Nameone;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement Codeone;

    @FindBy(xpath = "//span[text()='Address']")
    WebElement Address;

    @FindBy(xpath = "//span[text()='Contact']")
    WebElement Contact;

    @FindBy(xpath = "(//span[text()='Select'])[2]")
    WebElement btn_Selectone;

    @FindBy(xpath = "//span[text()='Select']")
   List <WebElement>  btn_Selecttwo;

    @FindBy(xpath = "//label[text()='Location:']/preceding-sibling::span")
    WebElement RequiredLocation;

    @FindBy(xpath = "//label[text()='Location:']")
    WebElement Location;

    @FindBy(xpath = "(//label[text()='Location:']/parent::span/following::div)[1]")
    WebElement LocationValue;

    @FindBy(xpath = "(//span[contains(.,'Add Lab')])[1]")
    public  WebElement label_AddLabor;

    @FindBy(xpath = "(//a[text()='VMRS'])[1]")
    public  WebElement label_VMRS;

    @FindBy(xpath = "//label[contains(.,'Search:')]/parent::td/following-sibling::td/child::input")
    public WebElement SearchTextArea;

    @FindBy(xpath = "//a[contains(@id,':1:cilvmrsys')]/child::img")
    WebElement imgBody;

    @FindBy(xpath = "(//img[contains(@id,':ciAddVmrs::icon')])[1]")
    public WebElement label_Add;

    @FindBy(xpath = "//span[text()='Add']")
    public WebElement label_AddButton;

    @FindBy(xpath = "//a[@title='DOOR HOLD BACK']/child::img")
    WebElement DoorHoldBack;

    @FindBy(xpath = "//a[contains(text(),'Body')]")
    WebElement Body;

    @FindBy(xpath = "//input[contains(@id,':itWoactDescription::content')]")
    WebElement DescriptionBody;

    @FindBy(xpath = "//textarea[contains(@id,':itWoactNotes::content')]")
    WebElement NotesTextArea;

    @FindBy(xpath = "(//a[contains(.,'Cancel')])[1]")
    WebElement Btn_Cancel;

    @FindBy(xpath = "(//a[contains(.,'OK')])[2]")
    WebElement Btn_Ok;

    @FindBy(xpath = "//a[contains(text(),'DOOR HOLD BACK')]")
    WebElement Doorholdback;

    @FindBy(xpath = "(//a[contains(.,'Repair Estimate')])[2]")
    WebElement RepairEstimate;

    @FindBy(xpath = "//h1[contains(.,'Working...Please Wait')]")
    List<WebElement> loder;

    /*go to Corporate Setup Manager **/
    public void gotoCorporateSetUpManager () throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Administration");
        ReusableActions.getActions().clickChildMenu("Corporate Setup Manager");

        }
      /**click On InvoiceSetup */
      public void clickOnInvoiceSetup () throws InterruptedException {
          WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(InvoiceSetup);
          WebElementActions.getActions().clickElement(InvoiceSetup);

          WaitActions.getWaits().loadingWait(loder);
          TestListener.saveScreenshotPNG(driver);

    }
    /*go to Part**/
    public void clickOnAdd () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Add);
        WebElementActions.getActions().clickElement(Add);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Select);
        WebElementActions.getActions().clickElement(btn_Select);

    }
    /*verify Work Order Estimation**/
    public void verifyWorkOrderEstimation () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(btn_WorkOrderEstimate);
        Assert.assertTrue(btn_WorkOrderEstimate.isDisplayed());
    }

    /*select WorkOrderQuickEstimateCustomAmericanBody**/
    public void selectAmericanBody () throws InterruptedException {
        Select objSelect = new Select(WorkOrderEstimate);
        objSelect.selectByVisibleText("WOQUIESTAB - Work Order Quick Estimate Custom American Body");
       WaitActions.getWaits().loadingWait(loder);
    }
    /*  click ok button **/
    public void clickonOkButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_OK);
        WebElementActions.getActions().clickElement(btn_OK);

    }
    /*click on Repair Location **/
   public void clickonRepairLocation () throws InterruptedException {
       WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RepairLocation);
       WebElementActions.getActions().clickElement(RepairLocation);

   }
   /*click on New Repair Location **/
    public void clickOnRepairLocation () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NewRepairLocation);
        WebElementActions.getActions().clickElement(NewRepairLocation);

    }
    /*verify Required Code,Code **/
    public void verifyOnRequiredCode () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredCode);
        Assert.assertTrue(RequiredCode.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code);
        Assert.assertTrue(Code.isDisplayed());
    }

    /*enter CodeTextArea**/
    public void  enterCodeTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(CodeTextArea);
        WebElementActions.getActions().inputText(CodeTextArea, CodeNumber);

    }
    /*verify Required Name ,Name **/
    public void verifyRequiredName () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredName);
        Assert.assertTrue(RequiredName.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Name);
        Assert.assertTrue(Name.isDisplayed());
    }
    /*Enter NametextArea**/
    public void enterTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NameTextArea);
        WebElementActions.getActions().inputText(NameTextArea, appProp.getProperty("NameTextArea"));
        TestListener.saveScreenshotPNG(driver);
    }
    /*verify PositionCoordinates **/
    public void verifyPositionCoordinates () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(PositionCoordinates);
        Assert.assertTrue(PositionCoordinates.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Country);
        Assert.assertTrue(Country.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Email);
        Assert.assertTrue(Email.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(phoneone);
        Assert.assertTrue(phoneone.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Cancel);
        Assert.assertTrue(Cancel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Create);
        Assert.assertTrue(Create.isDisplayed());

    }
    /*click on Create **/
    public void clickOnCreate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Create);
        WebElementActions.getActions().clickElement(Create);
        WaitActions.getWaits().loadingWait(loder);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SaveExit);
        WebElementActions.getActions().clickElement(SaveExit);
    }
     /* go to Serive Board **/
   public void gotoserviceboard () throws FileNotFoundException, InterruptedException {
       ReusableActions.getActions().clickParentMenu("Service");
       ReusableActions.getActions().clickChildMenu("Service Board");

   }
  /*click on Repair Estimates Inprogress **/
    public void clickOnRepairEstimatesInprogress () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RepairEstimatesInprogress);
        WebElementActions.getActions().clickElement(RepairEstimatesInprogress);
    }
    /*click on QuickEstimate**/
    public void clickOnQuickEstimate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(QuickEstimate);
        WebElementActions.getActions().clickElement(QuickEstimate);
    }
    /* verify NewRepairEstimate**/
    public void verifyOnNewRepairEstimate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NewRepairEstimate);
        Assert.assertTrue(NewRepairEstimate.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(SearchLocation);
        Assert.assertTrue(SearchLocation.isDisplayed());

    }
    /*enter SearchLocationTextArea **/
    public void entetSearchTextArea () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchLocationTextArea);
        WebElementActions.getActions().inputText(SearchLocationTextArea, appProp.getProperty("HALIFAX"));
        TestListener.saveScreenshotPNG(driver);
    }
     /*click on Select  **/
  public  void clickOnSelect () throws InterruptedException {
      WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Selecttwo.get(1));
      WebElementActions.getActions().clickElement(btn_Selecttwo.get(1));
      WaitActions.getWaits().loadingWait(loder);
  }
    /*click on Select  **/
    public  void clickOnSelectTwo () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(btn_Selecttwo.get(1));
        WebElementActions.getActions().clickElement(btn_Selecttwo.get(1));
        WaitActions.getWaits().loadingWait(loder);
    }
   /*verify Required location, Location , LocationValue **/
    public void verifyLocation () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(RequiredLocation);
        Assert.assertTrue(RequiredLocation.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Location);
        Assert.assertTrue(Location.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LocationValue);
        Assert.assertTrue(LocationValue.isDisplayed());

    }
    /* click Add Lobour**/
    public void clickOnAddLabour () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddLabor);
        WebElementActions.getActions().clickElement(label_AddLabor);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_VMRS);
        WebElementActions.getActions().clickElement(label_VMRS);


    }
    /* search BODY **/
    public void searchBody () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea,appProp.getProperty("Searchone"));
        WaitActions.getWaits().loadingWait(loder);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(imgBody);
        WebElementActions.getActions().clickElement(imgBody);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions().clickElement(label_Add);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddButton);
        WebElementActions.getActions().clickElement(label_AddButton);

    }
    /*search Door  **/
    public void searchDoor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(SearchTextArea);
        WebElementActions.getActions().inputText(SearchTextArea,appProp.getProperty("Searchtwo"));
        WaitActions.getWaits().loadingWait(loder);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(DoorHoldBack);
        WebElementActions.getActions().clickElement(DoorHoldBack);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_Add);
        WebElementActions.getActions().clickElement(label_Add);

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(label_AddButton);
        WebElementActions.getActions().clickElement(label_AddButton);
    }
    /*click on Hyperlink**/
    public void clickOnBody () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Body);
        WebElementActions.getActions().clickElement(Body);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DescriptionBody);
        Assert.assertTrue(DescriptionBody.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NotesTextArea);
        WebElementActions.getActions().inputText(NotesTextArea,appProp.getProperty("Note"));
        WaitActions.getWaits().loadingWait(loder);

    }
      /*verify Cancel Ok Button  **/
    public void verifyCancelButton () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Btn_Cancel);
        Assert.assertTrue(Btn_Cancel.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Btn_Ok);
        Assert.assertTrue(Btn_Ok.isDisplayed());
    }
    /*click Ok Button **/
    public void clickonOk () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Btn_Ok);
        WebElementActions.getActions().clickElement(Btn_Ok);
        WaitActions.getWaits().loadingWait(loder);

    }
    /*Door of Herperlink **/
    public void clickOnDoor () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Doorholdback);
        WebElementActions.getActions().clickElement(Doorholdback);

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(DescriptionBody);
        Assert.assertTrue(DescriptionBody.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(NotesTextArea);
        WebElementActions.getActions().inputText(NotesTextArea,appProp.getProperty("Note"));
        WaitActions.getWaits().loadingWait(loder);

    }
    /* click on Repair Estimate **/
    public void clickOnRepairEstimate () throws InterruptedException {
        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(RepairEstimate);
        WebElementActions.getActions().clickElement(RepairEstimate);
        WaitActions.getWaits().loadingWait(loder);
    }




















































}
