package pomPages.todoly;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class Settingsection {
    public Button profilebuton = new Button(By.xpath("//*[@id='settings_tabs']//a[contains(.,'Profile')]"));
    public TextBox passwprdOld = new TextBox(By.xpath("//input[@id='TextPwOld']"));
    public TextBox passwordnew = new TextBox(By.xpath("//input[@id='TextPwNew']"));
    public Button cambiarPassword = new Button(By.xpath("//div//button//span[contains(.,'Ok')]"));
    public Settingsection(){}
}