package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginEgi{
    private WebDriver driver;
    private By usernameInput =By.xpath(".//input[@name='search']");

    public LoginEgi(WebDriver driver) {
        this.driver = driver;

    }
}

