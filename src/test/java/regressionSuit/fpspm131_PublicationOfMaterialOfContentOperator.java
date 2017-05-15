package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PublicationPage;

import java.awt.*;

/**
 * Created by Avic on 5/3/2017.
 */
public class fpspm131_PublicationOfMaterialOfContentOperator extends BaseTest {
    @Test(priority = 1)
    public void authorizationOperatorTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_content_operator", "2wsx2WSX");
        loginPage.checkContentOperatorRoleName();
    }

    @Test(priority = 2)
    public void creationOfNewPublicationTest() throws InterruptedException, AWTException {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.publicationPageISDisplayed();
        publicationPage.checkRequiresFields();
        publicationPage.creationNewPublicationForContentOperator();
    }

    @Test(priority = 3)
    public void verifyNewCreatedRubric() throws InterruptedException, AWTException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.assertionOFCreatedPublicationForContentOperator();
    }

    @Test(priority = 4)
    public void verifyNewCreatedRubricChanging() throws InterruptedException, AWTException {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.allNeededTabsInPublicationPageIsDisplayed();
        publicationPage.changeNewCreatedPublicationForContentOperator();
    }

    @Test(priority = 5)
    public void verifyNewCreatedRubricAgain() throws InterruptedException, AWTException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.assertionOFCreatedPublicationForContentOperatorAfterChanging();
    }

    @Test(priority = 6)
    public void searchBySimpleOfMaterial() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.searchByMaterial();
    }

    @Test(priority = 7)
    public void verifyOfDeletionNewCreatedRubric() {
        MainPage mainPage = new MainPage(driver);
        mainPage.deleteNewCreatedPublication();
    }
}

