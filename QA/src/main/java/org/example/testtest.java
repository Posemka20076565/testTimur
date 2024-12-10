package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testtest {
    public static final String BOLD="\u001B[1m";
    public static final String G="\u001B[32m";
    public static final String B="\u001B[36m";
    public static final String Y="\u001B[33m";
    public static void main(String[]args){
        WebDriver driver;
        driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://speedtest.net.ua/");
        driver.findElement(By.id("speedo-start")).click();
        try{
            Thread.sleep(40000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//button[@class='modal-trigger btn btn-link']")).click();
        WebElement Upload=driver.findElement(By.cssSelector("div.data.upload span[data-attr='avg']"));
        String upload=Upload.getText();
        System.out.println(BOLD+B+"Upload Speed: "+upload+" Мбіт/с");
        WebElement Download=driver.findElement(By.cssSelector("div.data.download span[data-attr='avg']"));
        String download=Download.getText();
        System.out.println(BOLD+G+"Download Speed: "+download+" Мбіт/с");
        WebElement Ping=driver.findElement(By.cssSelector("div.data span.time"));
        String ping=Ping.getText();
        System.out.println(BOLD+Y+"Ping: "+ping+" мс");
    }
}