package com.syntax.class34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {


        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement(By.id("email")).sendKeys("Mike");
        driver.findElement(By.id("pass")).sendKeys("pass123");



    }
}
