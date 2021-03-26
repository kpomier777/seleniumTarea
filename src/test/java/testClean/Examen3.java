package testClean;

import org.junit.Assert;
import org.junit.Test;
import pomPages.todoly.*;
import singletonSession.Session;

public class Examen3 extends TestBaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    ProjectOptionsPage projectOptionsPage = new ProjectOptionsPage();
    Settingsection settingsection = new Settingsection();
    String user="kevinpomier.kp@gmail.com";
    String pwd="kevin";
    String newpwd="kevin123";

    @Test
    public void verify_create_project_todoly() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        centerSection.setingbuton.click();
        settingsection.profilebuton.click();
        settingsection.passwprdOld.set(pwd);
        settingsection.passwordnew.set(newpwd);
        settingsection.cambiarPassword.click();

        centerSection.logoutbuton.click();

        mainPage.loginImage.click();
        loginModal.loginAction(user,newpwd);

        Thread.sleep(4000);
        Assert.assertTrue("ERROR, no se logueo",centerSection.projectNameLabel.controlIsDisplayed());

    }





}