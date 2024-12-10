package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void PD2(String gamename){
        driver.findElement(By.xpath(".//input[@type='text']")).sendKeys(gamename);
    }
    public void Submit(){
        driver.findElement(By.xpath(".//input[@type='submit']")).click();
    }
    public void Album(){
        driver.findElement(By.xpath(".//a[@href='/game-soundtracks/album/payday-2-the-soundtrack']")).click();
    }
    public void Cookie(){
        driver.findElement(By.xpath(".//div[@class='cookieinfo-close']")).click();
    }
    public void Comment(){
        driver.findElement(By.xpath(".//a[@href='/forums/index.php?threads/8285']")).click();
    }
    public void Login(){
        driver.findElement(By.xpath(".//a[@class='p-navgroup-link p-navgroup-link--textual p-navgroup-link--logIn']")).click();
    }
    public void Username(String username){
        driver.findElement(By.xpath(".//input[@autofocus='autofocus']")).sendKeys(username);
    }
    public void Password(String password){
        driver.findElement(By.xpath(".//input[@type='password']")).sendKeys(password);
    }
    public void login(){
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
    }
}