package pomPages.todoly;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class CenterSection {
    public Label projectNameLabel= new Label(By.xpath("//div[@id='CurrentProjectTitle']"));
    public Button setingbuton = new Button(By.xpath("//td//a[contains(.,'Settings')]"));
    public Button logoutbuton = new Button(By.xpath("//*[@id='ctl00_HeaderTopControl1_LinkButtonLogout']"));
    public CenterSection(){}
}