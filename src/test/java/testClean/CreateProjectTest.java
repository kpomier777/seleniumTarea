package testClean;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import pomPages.todoly.*;
import singletonSession.Session;

public class CreateProjectTest extends TestBaseTodoLy {
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    LeftSection leftSection= new LeftSection();
    CenterSection centerSection= new CenterSection();
    ProjectOptionsPage projectOptionsPage = new ProjectOptionsPage();
    String user="kevinpomier.kp@gmail.com";
    String pwd="kevingay";

    @Test
    public void verify_create_project_todoly() throws InterruptedException {
        String name="KevinProject";
        mainPage.loginImage.click();
        loginModal.loginAction(user,pwd);

        leftSection.addNewProjectButton.click();
        leftSection.nameProjectTextBox.set(name);
        leftSection.addButton.click();

        this.waitOnSecond(2);
        Assert.assertEquals("ERROR !!Proyecto No Creado",name, centerSection.projectNameLabel.getText());

        String newName = "El Kevin Project";


        leftSection.selectProject(name);
        leftSection.projectOpsButton.click();
        projectOptionsPage.editButton.click();
        leftSection.editProjectField.clear();
        leftSection.editProjectField.set(newName);
        leftSection.saveEditedProject.click();
        this.waitOnSecond(2);
        Assert.assertEquals("Proyecto no actualizado", newName, centerSection.projectNameLabel.getText());

        leftSection.selectProject(newName);
        leftSection.projectOpsButton.click();
        projectOptionsPage.deleteButton.click();
        Session.getSession().acceptAlert();
        this.waitOnSecond(2);
        Assert.assertFalse("Proyecto no fue borrado", leftSection.isDisplayedProj(newName));


    }





}