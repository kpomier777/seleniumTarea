package factoryBrowser;

public class FactoryBrowser {

    public static IBrowser make(String type){
        IBrowser browser;
        switch (type){
            case "chrome":
                browser=new Chrome();
                break;
            case "firefox":
                browser=new FireFox();
                break;
            case "edge":
                browser=new Edge();
                break;
            case "cloud":
                browser=new BrowserStack();
                break;
            case "cloudFireFox":
                browser=new BrowserStackFireFox();
                break;
            default:
                browser=new Chrome();
                break;
        }
        return  browser;
    }
}