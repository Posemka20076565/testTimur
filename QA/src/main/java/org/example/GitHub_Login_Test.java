package org.example;

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
        driver.findElement(By.xpath(".//input[@name='search']")).sendKeys("Portal 2");
        driver.findElement(By.xpath(".//input[@type='submit']")).click();
        driver.findElement(By.xpath(".//a[@href='/game-soundtracks/album/portal-2-soundtrack-songs-to-test-by-collectors-edition']")).click();
        driver.findElement(By.xpath(".//span//i[@class='material-icons']")).click();
        driver.findElement(By.xpath(".//div[@class='audioplayerVolumeBarLevel']")).click();

    }
}