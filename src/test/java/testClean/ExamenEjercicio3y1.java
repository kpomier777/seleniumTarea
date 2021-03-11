package testClean;

import org.junit.Assert;
import org.junit.Test;
import pomPages.todoist.LoginModal;
import pomPages.todoist.MainPage;
import pomPages.todoist.MenuProfile;
import pomPages.todoist.PrincipalPage;


public class ExamenEjercicio3y1 extends TestBaseTodoist{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    PrincipalPage principalPage= new PrincipalPage();
    MenuProfile menuprofile = new MenuProfile();
    String user="kevinpomier.kp@gmail.com";
    String pwd="kevinmarcelo";

    @Test
    public void verify_login_todoly() throws InterruptedException {


        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(pwd);
        loginModal.loginButton.click();
        principalPage.optionsprofile.click();
        Assert.assertTrue("ERROR, no se logueo",menuprofile.logoutButton.controlIsDisplayed());
    }
}
