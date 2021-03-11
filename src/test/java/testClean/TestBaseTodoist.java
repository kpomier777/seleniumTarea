package testClean;

import org.junit.After;
import org.junit.Before;
import singletonSession.Session;

import java.io.IOException;

public class TestBaseTodoist {

    @Before
    public void open(){
        Session.getSession().getDriver().get("https://todoist.com/");
    }

    @After
    public void close() throws IOException {
        Session.getSession().closeSession();
        // solo para windows
        // this.killChromeDriver();
    }

    public void waitOnSecond(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }

    //TASKKILL /F /IM chromedriver.exe /T
    public void killChromeDriver() throws IOException {
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
