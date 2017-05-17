package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.PublicationPage;

import java.awt.*;
import java.io.IOException;

/**
 * Created by Avic on 5/4/2017.
 */
public class fpspm131_PublicationOfMaterialOfAnalitic extends BaseTest {

    @Test (priority=1)
    public void authorizationAnaliticTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("dbn_analyst_ca", "2wsx2WSX");
        loginPage.checkAnaliticRoleName();
    }

    @Test (priority=2)
    public void creationOfNewPublicationTest() throws InterruptedException, AWTException, IOException {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.publicationPageISDisplayed();
        publicationPage.checkRequiresFields();
        publicationPage.creationNewPublicationForAnalitic();
    }

    @Test(priority=3)
    public void verifyNewCreatedRubric() throws InterruptedException, AWTException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.assertionOFCreatedPublicationForAnalitic();
    }

    @Test(priority = 4)
    public void verifyNewCreatedRubricChanging() throws InterruptedException, AWTException {
        PublicationPage publicationPage = new PublicationPage(driver);
        publicationPage.allNeededTabsInPublicationPageIsDisplayed();
        publicationPage.changeNewCreatedPublicationForAnalitic();
    }

    @Test(priority = 5)
    public void verifyNewCreatedRubricAgain() throws InterruptedException, AWTException {
        MainPage mainPage = new MainPage(driver);
        mainPage.mainPageIsDisplayed();
        mainPage.assertionOFCreatedPublicationForAnliticAfterChanging();
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