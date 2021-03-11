
package pomPages.todoist;

import controls.Button;
import controls.TextBox;
import org.openqa.selenium.By;

public class LoginModal {
    public TextBox emailTextBox= new TextBox(By.xpath("//input[@id='email']"));
    public TextBox pwdTextBox= new TextBox(By.xpath("//input[@id='password']"));
    public Button loginButton= new Button(By.xpath("//button[contains(.,'Inicia sesión')]"));

    public LoginModal(){}

    public void loginAction(String user, String pwd){
        emailTextBox.set(user);
        pwdTextBox.set(pwd);
        loginButton.click();
    }

}