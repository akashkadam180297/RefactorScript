package pages.administration;

import actions.ReusableActions;
import actions.WaitActions;
import actions.WebElementActions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import tests.TestDriverActions;
import utils.TestListener;

import java.io.FileNotFoundException;

public class TransitonedPaccar extends TestDriverActions {
    @FindBy(xpath = "(//a[contains(text(),'Equipment')])[3]")
    WebElement Equipment;

    @FindBy(xpath = "(//a[contains(text(),'Part Positions')])[1]")
    WebElement PartPositions;


    @FindBy(xpath = "//span[text()='New Part Position']")
    WebElement NewPartPosition;

    @FindBy(xpath = "//span[text()='Code']")
    WebElement Code;

    @FindBy(xpath = "//span[text()='Description']")
    WebElement Description;

    @FindBy(xpath = "//span[text()='Axle']")
    WebElement Axle;

    @FindBy(xpath = "//span[text()='Left/ Right']")
    WebElement LeftAndRight;

    @FindBy(xpath ="//span[text()='Inner/ Outer']")
    WebElement Inner;

    @FindBy(xpath = "//span[text()='Notes']")
    WebElement Notes;

    @FindBy(xpath = "(//span[contains(text(),'RF1')])[1]")
    WebElement codeValue;

    @FindBy(xpath = "(//span[contains(text(),'Right ')])[1]")
    WebElement DescriptionvaLue;

    @FindBy(xpath = "//label[contains(.,'Invoiced')]/preceding-sibling::input")
    WebElement invoicedRadiio;



    /**go to Standard Codes*/
    public static void gotoCustomerScreen() throws FileNotFoundException, InterruptedException {
        ReusableActions.getActions().clickParentMenu("Administration");
        ReusableActions.getActions().clickChildMenu("Standard Codes");
        TestListener.saveScreenshotPNG(driver);


    }
    /**click on Equipment*/
    public void clickonEquipment () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(Equipment);
        WebElementActions.getActions().clickElement(Equipment);
    }
    /**click on Part Position */
    public void clickOnPartPosition () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndClickable(PartPositions);
        WebElementActions.getActions().clickElement(PartPositions);
    }
    /**verify New Part Position */
    public  void verifyNewOnPartPosition () throws InterruptedException {

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(NewPartPosition);
        Assert.assertTrue(NewPartPosition.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Code);
        Assert.assertTrue(Code.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Description);
        Assert.assertTrue(Description.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Axle);
        Assert.assertTrue(Axle.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(LeftAndRight);
        Assert.assertTrue(LeftAndRight.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Inner);
        Assert.assertTrue(Inner.isDisplayed());

        WaitActions.getWaits().waitForElementToBeRefreshedAndIsVisible(Notes);
        Assert.assertTrue(Notes.isDisplayed());


    }
    /** verify codeValue and codeValue */
    public void verifyCodevalue () {

    }

}
