package project02;



public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[] remoteWebDrivers={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(RemoteWebDriver wd:remoteWebDrivers){
            wd.open();
            wd.close();
            System.out.println(wd.getTitle());
            wd.navigate();


        }
    }
}


