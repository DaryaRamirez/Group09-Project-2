package com.syntax.Group09Project2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();
}
interface TakeScreenshot{
    void getScreenshot();
}
interface RemoteWebDriver extends TakeScreenshot,WebDriver{
    void navigate();
}
class ChromeDriver implements RemoteWebDriver{
    @Override
    public void open(){
        System.out.println("Opens Chrome");
    }
    @Override
    public void close(){
        System.out.println("Closes Chrome");
    }
    @Override
    public String getTitle(){
        return "Chrome";
    }
    @Override
    public void getScreenshot(){
        System.out.println("Chrome takes Screenshots");
    }

    @Override
    public void navigate() {
        System.out.println("Chrome Navigates");
    }
}
 class FireFoxDriver implements RemoteWebDriver{
     @Override
     public void open(){
         System.out.println("Opens FireFoxDriver");
     }
     @Override
     public void close(){
         System.out.println("Closes FireFoxDriver");
     }
     @Override
     public String getTitle(){
         return "FireFoxDriver";
     }
     @Override
     public void getScreenshot(){
         System.out.println("FireFoxDriver takes Screenshots");
     }

     @Override
     public void navigate() {
         System.out.println("FireFoxDriver Navigates");
     }
 }
 class SafariDriver implements RemoteWebDriver{
     @Override
     public void open(){
         System.out.println("Opens SafariDriver");
     }
     @Override
     public void close(){
         System.out.println("Closes SafariDriver");
     }
     @Override
     public String getTitle(){
         return "SafariDriver";
     }
     @Override
     public void getScreenshot(){
         System.out.println("SafariDriver takes Screenshots");
     }

     @Override
     public void navigate() {
         System.out.println("SafariDriver Navigates");
     }
 }
