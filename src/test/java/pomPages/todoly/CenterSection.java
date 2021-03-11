package pomPages.todoly;

import controls.Label;
import org.openqa.selenium.By;

public class CenterSection {
    public Label projectNameLabel= new Label(By.xpath("//div[@id='CurrentProjectTitle']"));
    public Label basurerovacio= new Label(By.xpath("//div[@id='MainContentArea']//div[contains(.,'There are no items to display')]"));
    public CenterSection(){}
}