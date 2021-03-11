package pomPages.todoist;

import controls.Image;
import controls.Label;
import org.openqa.selenium.By;

public class MainPage {
    public Image loginImage= new Image(By.xpath("//ul[@class='_3XsmI']/li/a[contains(.,'Iniciar sesión')]"));

    public MainPage() {

    }
}