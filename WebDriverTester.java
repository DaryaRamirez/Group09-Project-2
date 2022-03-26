package com.syntax.Group09Project2;

public class WebDriverTester {
    public static void main(String[] args) {
        RemoteWebDriver[]webdriver={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(RemoteWebDriver web:webdriver){
            web.open();
            web.close();
            System.out.println(web.getTitle());
            web.getScreenshot();
            web.navigate();
        }
    }
}
