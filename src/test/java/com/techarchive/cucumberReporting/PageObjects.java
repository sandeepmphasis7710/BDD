package com.techarchive.cucumberReporting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.edge.EdgeDriver;

public class PageObjects {

    public WebDriver driver;

    public PageObjects(WebDriver driver)
    {

        this.driver = driver;
    }

}
