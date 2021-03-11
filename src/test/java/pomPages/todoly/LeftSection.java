package pomPages.todoly;

import controls.Button;
import controls.Image;
import controls.TextBox;
import controls.Label;
import org.openqa.selenium.By;

public class LeftSection {
    public Button addNewProjectButton= new Button(By.xpath("//td[contains(.,'Add New Project') and @class='ProjItemContent']"));
    public Button basurero= new Button(By.xpath("//td[contains(.,'Recycle Bin') and @class='FilterItemContent']"));
    public Button addButton= new Button(By.xpath("//input[@id='NewProjNameButton']"));
    public TextBox nameProjectTextBox= new TextBox(By.xpath("//input[@id='NewProjNameInput']"));
    public Button projectOpsButton = new Button(By.xpath("//div[@style='display: block;']/img[@src='/Images/dropdown.png']"));
    public TextBox editProjectField = new TextBox(By.id("ItemEditTextbox"));

    public Image saveEditedProject = new Image(By.id("ItemEditSubmit"));
    public Image openmenurecicly= new Image(By.xpath("//div[@class='ProjItemMenu' and @itemid='-3']//img[@src='/Images/dropdown.png' and @title='Options']"));
    public LeftSection(){


    }
    public void selectProject(String nameProj){
        String locator ="//li/div/table/tbody/tr/td[contains(.,\""+nameProj+"\")]";
        Label nameProjectLink = new Label(By.xpath(locator));
        nameProjectLink.click();
    }

    public boolean isDisplayedProj(String nameProj){
        String locator = "//table[@class=\"ProjItemTable\"]/tbody/tr/td[contains(.,\"" + nameProj + "\")]";
        Label nameProjectLink = new Label(By.xpath(locator));
        return nameProjectLink.isDisplayed();
    }


}