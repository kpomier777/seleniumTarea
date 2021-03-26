package testClean;


import org.junit.Assert;
import org.junit.Test;
import pomPages.todoly.LoginModal;
import pomPages.todoly.MainPage;
import pomPages.todoly.MenuSection;



public class LoginTest extends  TestBaseTodoLy {

    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection= new MenuSection();
    String user="kevinpomier.kp@gmail.com";
    String pwd="kevingay";

    @Test
    public void verify_login_todoly(){

        mainPage.loginImage.click();
        loginModal.emailTextBox.set(user);
        loginModal.pwdTextBox.set(pwd);
        loginModal.loginButton.click();
        Assert.assertTrue("ERROR, no se logueo",menuSection.logoutButton.controlIsDisplayed());
    }

}