package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import pomPages.todoly.LoginModal;
import pomPages.todoly.MainPage;
import pomPages.todoly.MenuSection;
import singletonSession.Session;


public class LoginTest {

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection= new MenuSection();
    String user="kevinpomier.kp@gmail.com";
    String pwd="kevingay";

    @Test
    public void verify_login_todoly(){
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(pwd);
        loginModal.loginButton.click();
        Assert.assertTrue("ERROR, no se logueo",menuSection.logoutButton.controlIsDisplayed());
    }

    @After
    public void close(){
        Session.getSession().closeSession();
    }

}