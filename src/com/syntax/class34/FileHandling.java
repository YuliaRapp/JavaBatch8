package com.syntax.class34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws FileNotFoundException {


        String path="C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch8\\src\\com\\syntax\\class34\\Credentials.properties";

        FileInputStream fileInputStream=new FileInputStream(path);



        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement(By.id("email")).sendKeys("Mike");
        driver.findElement(By.id("pass")).sendKeys("pass123");



    }
}
