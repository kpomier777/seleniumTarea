package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackFireFox implements  IBrowser {

    public static final String USERNAME = "kevinpomier2";
    public static final String AUTOMATE_KEY = "p2EqdyvZn3gpzdc9aHUG";
    public static final String URL_BROWSERSTACK = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Override
    public WebDriver create() {
        WebDriver driver=null;
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("os", "Windows");
        caps.setCapability("os_version", "10");
        caps.setCapability("browser", "firefox");
        caps.setCapability("browser_version", "81.0");
        caps.setCapability("name", "UPB Test");

        try {
            driver = new RemoteWebDriver(new URL(URL_BROWSERSTACK), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        return driver;
    }
}