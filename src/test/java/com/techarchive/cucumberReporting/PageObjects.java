package com.techarchive.cucumberReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class PageObjects {

    public WebDriver driver;



    public void open_url()
    {
        System.setProperty("webdriver.edge.driver", "C:/Users/sandeep.s8/IdeaProjects/msedgedriver.exe");
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver;

        driver = new EdgeDriver(options);
        driver.get("http://www.google.com");

    }
}
