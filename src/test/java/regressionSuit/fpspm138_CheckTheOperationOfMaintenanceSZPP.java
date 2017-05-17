package regressionSuit;

import listner.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;

/**
 * Created by Avic on 5/16/2017.
 */
public class fpspm138_CheckTheOperationOfMaintenanceSZPP extends BaseTest {
    @Test
    public void authorizationOperatorContentTest() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.authorization("szpp_content_operato","2wsx2WSX");
        loginPage.checkContentOperatorContentSZPP();
    }
    @Test
    public void creationNewDepartmentTest() throws InterruptedException {
        MainPage mainPage = new MainPage(driver);
        mainPage.creationNewDepartment();
    }
}
