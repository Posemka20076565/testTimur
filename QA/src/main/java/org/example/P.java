package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P {
    public static void main(String[] args) {
        WebDriver driver;
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://prom.ua/");
        driver.findElement(By.xpath(".//input")).sendKeys("Рюкзак");
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
        try{
            Thread.sleep(12000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        driver.findElement(By.xpath(".//button//div[@class='M3v0L']")).click();




    }
}