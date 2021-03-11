package pomPages.todoist;

import controls.Image;
import controls.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Image loginImage= new Image(By.xpath("/html/body/div/div/main/div[1]/header/nav/div/ul[2]/li[1]/a"));

    public MainPage() {


    }
}