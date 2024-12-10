package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class devtools {
    public static void main(String[] args) {

        WebDriver driver;
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        // Перейти на сайт
        driver.get("https://www.saucegdemo.com/");

        // Знайти кнопку play і натиснути на неї
    }
}
