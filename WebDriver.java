package project02;

public interface WebDriver {
    /*Provide Implementation for the diagram below. Then create a test class
   in which you need to create Objects of ChromeDriver, FirefoxDrive and
                   SafariDriver classes and see which methods available to them.*/
    void open();
    void close();
    String getTitle();
}

interface RemoteWebDriver extends WebDriver {
     void navigate();
}
interface TakesScreenShot extends RemoteWebDriver {
    void getScreenShot();
}
class ChromeDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening chrome browser");
    }

    @Override
    public void close() {
        System.out.println("Closing chrome browser");
    }

    @Override
    public String getTitle() {
        return "title";
    }
    @Override
    public void navigate() {
        System.out.println("Navigate to url on chrome");
    }
}
class FireFoxDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening firefox");
    }

    @Override
    public void close() {
        System.out.println("Closing firefox");
    }

    @Override
    public String getTitle() {
        return "title";
    }
    @Override
    public void navigate() {
        System.out.println("Navigate url on firefox");
    }
}
class SafariDriver implements RemoteWebDriver {

    @Override
    public void open() {
        System.out.println("Opening safari");
    }

    @Override
    public void close() {
        System.out.println("Closing safari");
    }

    @Override
    public String getTitle() {
        return "title";
    }

    @Override
    public void navigate() {
        System.out.println("Navigate to url on safari");
    }
}


