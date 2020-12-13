package com.syntax.class35;

public class PropertiesFileHandling {
    public static void main(String[] args) {

        String baseAddress = System.getProperty("user.dir");
        String fileAddress=baseAddress+"\\"+"ConfigData.properties";
        System.out.println(fileAddress);

    }
}
