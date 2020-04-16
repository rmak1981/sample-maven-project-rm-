package com.demo.nopcommerce.loadproperty;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperty {

    String projectpath = System.getProperty("user.dir");

    static Properties prop;
    static FileInputStream input;

    public String getProperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(projectpath + "/src/test/java/com/demo/nopcommerce/resources/propertiesfile/config.properties");
            prop.load(input);

        } catch (IOException e) {
            e.printStackTrace();
        }return prop.getProperty(key);

    }

    public static void main(String[] args) {
        LoadProperty loadProperty = new LoadProperty();
        System.out.println(loadProperty.getProperty("browser"));
    }
}