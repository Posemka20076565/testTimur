package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class prom {
    private static final Logger logger = LogManager.getLogger(prom.class);
    public static void main(String[] args){
        WebDriver driver;
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        promPage prom=new promPage(driver);

        try{
            driver.get("https://prom.ua/");
            if (logger.isInfoEnabled()){
                logger.info("команда пацює");
            }}catch (Exception e) {
            logger.info("Виникла помилка");
        }try{
            prom.search("рюкзаки");
            if (logger.isInfoEnabled()){
                logger.info("команда пацює");
            }}catch (Exception e) {
            logger.info("Виникла помилка");
        }try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        try{
            prom.submit();
            if (logger.isInfoEnabled()){
                logger.info("команда пацює");
            }}catch (Exception e){
            logger.info("Виникла помилка");
        }try{
            prom.option1();
            if (logger.isInfoEnabled()){
                logger.info("команда пацює");
            }}catch (Exception e){
            logger.info("Виникла помилка");
        }try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }try{
            prom.option1();
            if (logger.isInfoEnabled()){
                logger.info("команда пацює");
            }}catch (Exception e){
            logger.info("Виникла помилка");
        }try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }try{
            prom.button();
            if (logger.isInfoEnabled()) {
                logger.info("команда пацює");
            }}catch (Exception e) {
            logger.info("Виникла помилка");
        }try{
            Thread.sleep(6000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }try{
            prom.last_name("Даценко");
            if (logger.isInfoEnabled()){
                logger.info("команда пацює");
            }}catch (Exception q){
            logger.info("Виникла помилка");
        }try{
            prom.name("Тимур");
            if (logger.isInfoEnabled()){
                logger.info("команда пацює");
            }}catch (Exception e){
            logger.info("Виникла помилка");
        }

    }
}