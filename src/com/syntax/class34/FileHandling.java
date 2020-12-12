package com.syntax.class34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) throws IOException {


        String path="C:\\Users\\Asghar Nazir\\IdeaProjects\\JavaBatch8\\src\\com\\syntax\\class34\\Credentials.properties";

        FileInputStream fileInputStream=new FileInputStream(path);


        Properties properties=new Properties();
        properties.load(fileInputStream);
        String username= (String) properties.get("username");
        String pass= (String) properties.get("password");


        System.setProperty ( "webdriver.chrome.driver", "drivers/chromedriver.exe" );
        WebDriver driver = new ChromeDriver( );
        driver.get ( "https://www.facebook.com/" );
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("pass")).sendKeys(pass);



    }
}
