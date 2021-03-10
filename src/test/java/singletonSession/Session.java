package singletonSession;

import factoryBrowser.FactoryBrowser;
import org.openqa.selenium.WebDriver;

public class Session {

    private static Session session=null;
    private WebDriver driver;

    private Session(){
        this.driver=FactoryBrowser.make("firefox").create();
        //Tarea firefox con Cloud y con driver
        //this.driver=FactoryBrowser.make("cloudFireFox").create();
    }

    public static Session getSession(){
        if (session==null)
            session= new Session();
        return session;
    }

    public WebDriver getDriver(){
        return driver;
    }

    public void closeSession(){
        driver.quit();
        session=null;
    }
    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }


}