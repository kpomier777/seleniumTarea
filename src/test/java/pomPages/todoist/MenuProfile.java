package pomPages.todoist;

import controls.Button;
import org.openqa.selenium.By;

public class MenuProfile {

    public Button logoutButton = new Button(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[1]/a"));
    public MenuProfile (){}
}
