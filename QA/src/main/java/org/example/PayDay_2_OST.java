package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PayDay_2_OST{
    public static void main(String[]args) {
        WebDriver driver;
        driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://downloads.khinsider.com/");
        LoginPage loginPage=new LoginPage(driver);
        loginPage.PD2("PayDay 2");
        loginPage.Submit();
        loginPage.Album();
        loginPage.Cookie();
        loginPage.Comment();
        loginPage.Login();
        try{
            Thread.sleep(3333);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        loginPage.Username("Pageobject2024");//("Pageobject2024")
        loginPage.Password("3llP01VhO8O41ia");//("3llP01VhO8O41ia")
        loginPage.login();
        WebElement error=driver.findElement(By.xpath("//div[@class='blockMessage blockMessage--error blockMessage--iconic']"));
        if (error.isDisplayed()){
            System.out.println("Вхід в акаунт виконаний невірно");
        }
        driver.quit();
    }
}