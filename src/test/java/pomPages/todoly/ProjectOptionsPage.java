package pomPages.todoly;

import controls.Button;
import org.openqa.selenium.By;

public class ProjectOptionsPage {

    public Button editButton = new Button(By.xpath("//*[@id='projectContextMenu']/li/a[@href='#edit']"));
    public Button deleteButton = new Button(By.xpath("//*[@id='projectContextMenu']/li/a[@href='#delete']"));
    public ProjectOptionsPage() {
    }
}
