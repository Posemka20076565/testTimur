package org.example.GitHub.Log_in;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GitHub_Login_Test {
    public static void main(String[] args) {
        WebDriver driver;
        driver=new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.get("https://downloads.khinsider.com/");
        driver.findElement(By.xpath(".//a[@href='/forums/login']")).click();
        driver.findElement(By.xpath(".//input[@class='input']")).sendKeys("Timur2008");
        driver.findElement(By.xpath(".//input[@name='password']")).sendKeys("NrVSqSfLJ9ggV3f");
        driver.findElement(By.xpath(".//button[@type='submit']")).click();
        driver.findElement(By.xpath(".//div[@class='cookieinfo-close']")).click();
    }
}