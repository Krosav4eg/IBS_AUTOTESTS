package pages;

import basePage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.testng.Assert.assertTrue;
import static utils.Constants.*;

/**
 * Created by Sergey_Potapov
 */

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    //========================MAIN PAGE TAB=============================================

    @FindBy(xpath = MAIN_PAGE)
    protected WebElement mainPageTab;

    //========================Organizational level SECTION=============================================

    @FindBy(xpath = ORG_LEVEL_BLOCK)
    protected WebElement orgBlock;

    //========================THEME RUBRICS SECTION=============================================

    @FindBy(xpath = THEME_RUBRIC_BLOCK)
    protected WebElement themeRibricBlock;

    //========================TEST DATA RIGHT SECTION=============================================

    @FindBy(xpath = TEST_DATA_RIGHT_SECTION)
    protected WebElement testDataRightSection;

    //-------------------------------------CREATED_RUBRIC_ASSERTION-------------------------------

    @FindBy(xpath = CREATED_RUBRIC_ASSERTION)
    private WebElement createdRubricAssertion;

    @FindBy(xpath = DATE_OF_SIGNATURE_NEWCREATED_RUBRIC)
    private WebElement dateOfSignatureNewCreatedRubric;

    @FindBy(xpath = PUBLISED_NEWCREATED_RUBRIC)
    private WebElement publishedNewCreatedRubric;

    @FindBy(xpath = PUBLISED_NEWCREATED_AUTHOR)
    private WebElement publishedNewCreatedAuthor;

    @FindBy(xpath = PUBLISED_PERSON_NEWCREATED_RUBRIC)
    private WebElement publishedNewCreatedRUBRIC;

    @FindBy(xpath = PUBLISED_PERSON_NEWCREATED_RUBRIC_FOR_ANALITIC)
    private WebElement publishedNewCreatedRUBRICForAnalitic;

    @FindBy(xpath = BR)
    private WebElement br;

    @FindBy(xpath = MI)
    private WebElement mi;

    @FindBy(xpath = RUBRICS)
    private WebElement rubrics;

    @FindBy(xpath = TEMPLATE_BUTTON)
    private WebElement templateButton;

    @FindBy(xpath = EDIT_BUTTON)
    private WebElement editButto;

    @FindBy(xpath = DELETE_BUTTON)
    private WebElement deleteButton;

    @FindBy(xpath = DELETE_NEW_RUBRIC_BUTTON)
    private WebElement deleteNewRubricButton;

    //--------------------------------------MY METHODS--------------------------------------------------

    public void mainPageIsDisplayed() throws InterruptedException {
        logger.info("Main page is displayed");
        Thread.sleep(5000);
        elementVisibility(mainPageTab, driver).click();
    }

    public void allNeededSectionAreDisplayed() {
        logger.info("Assertion All needed section");
        elementVisibility(orgBlock, driver);
        elementVisibility(themeRibricBlock, driver);
        elementVisibility(testDataRightSection, driver);
    }

    public void assertionOFCreatedPublicationForContentOperator() {
        logger.info("Assertion of created publication for content operator");
        elementVisibility(createdRubricAssertion, driver);
        elementVisibility(dateOfSignatureNewCreatedRubric, driver);
        elementVisibility(publishedNewCreatedRubric, driver);
        elementVisibility(publishedNewCreatedAuthor, driver);
        elementVisibility(publishedNewCreatedRUBRIC, driver);
        elementVisibility(br, driver);
        elementVisibility(rubrics, driver);
        elementVisibility(templateButton, driver);
        elementVisibility(editButto, driver).click();

    }

    public void assertionOFCreatedPublicationForAnalitic() {
        logger.info("Assertion of created publication for Analitic");
        elementVisibility(createdRubricAssertion, driver);
        assertTrue(createdRubricAssertion.getText().contains("Autotest"));

        elementVisibility(dateOfSignatureNewCreatedRubric, driver);
        assertTrue(dateOfSignatureNewCreatedRubric.getText().contains("3.05.2017"));

        elementVisibility(publishedNewCreatedAuthor, driver);
        assertTrue(publishedNewCreatedAuthor.getText().contains("Sergey"));

        elementVisibility(rubrics, driver);
        elementVisibility(templateButton, driver);
        elementVisibility(editButto, driver);
        elementVisibility(editButto, driver).click();
    }

    public void assertionOFCreatedPublicationForContentOperatorAfterChanging() {
        logger.info("Assertion OF CreatedPublication For Content Operator After Changing");
        elementVisibility(createdRubricAssertion, driver);
        assertTrue(createdRubricAssertion.getText().contains("NewAutotest"));

        elementVisibility(dateOfSignatureNewCreatedRubric, driver);
        assertTrue(dateOfSignatureNewCreatedRubric.getText().contains("12.05.2017"));

        elementVisibility(publishedNewCreatedAuthor, driver);
        assertTrue(publishedNewCreatedAuthor.getText().contains("Alex"));

        elementVisibility(rubrics, driver);
        elementVisibility(templateButton, driver);
        elementVisibility(editButto, driver);
    }

    public void assertionOFCreatedPublicationForAnliticAfterChanging() {
        logger.info("Assertion OF Created Publication For Analitic AfterChanging");
        elementVisibility(createdRubricAssertion, driver);
        assertTrue(createdRubricAssertion.getText().contains("NewAutotest"));

        elementVisibility(dateOfSignatureNewCreatedRubric, driver);
        assertTrue(dateOfSignatureNewCreatedRubric.getText().contains("12.05.2017"));

        elementVisibility(publishedNewCreatedAuthor, driver);
        assertTrue(publishedNewCreatedAuthor.getText().contains("Alex"));

        elementVisibility(rubrics, driver);
        elementVisibility(templateButton, driver);
        elementVisibility(editButto, driver);
    }

    public void deleteNewCreatedPublication() {
        logger.info("Delete New Created Publication");
        elementVisibility(deleteButton, driver).click();
        elementVisibility(deleteNewRubricButton, driver).click();
        elementInvisibility(By.xpath("//div/a[contains(text(),'NewAutotest')]"), driver);
    }
}