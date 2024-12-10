package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Portal_2_OST{
    public static void main(String[]args) {
        WebDriver driver;
        driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://downloads.khinsider.com/");
        LoginPage loginPage = new LoginPage(driver);


        try{
            Thread.sleep(3958);
        }catch(InterruptedException e){
            e.printStackTrace();
        }

    }
}