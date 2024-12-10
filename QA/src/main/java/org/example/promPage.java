package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class promPage {
    private static final Logger logger = LogManager.getLogger(prom.class);
    private WebDriver driver;

    public promPage(WebDriver driver) {
        this.driver = driver;
    }

    public void search(String search) {
        driver.findElement(By.xpath(".//input")).sendKeys(search);
    }

    public void submit(){
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
    }

    public void option1() {
        driver.findElement(By.xpath(".//button//di[@class='M3v0L']")).click();
    }
    public void button() {
        driver.findElement(By.xpath(".//button[@data-testid='create_order_btn']")).click();
    }
    public void last_name(String last_name){
        driver.findElement(By.xpath(".//input[@id='last_name_block']")).sendKeys(last_name);
    }
    public void name(String name) {
        driver.findElement(By.xpath(".//input[@id='first_name_block']")).sendKeys(name);
    }
}