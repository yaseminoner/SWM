package com.svm.utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.io.IOException;

public class ConfigurationReader {

    private static Properties properties=new Properties();
    static{
        try {
            FileInputStream file= new FileInputStream("configuration.properties");

            properties.load(file);
            file.close();
        } catch (IOException e) {
            System.out.println("File not found in the Configuration class.");
            e.printStackTrace();
        }

    }
    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
