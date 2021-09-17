package utilities;

import java.io.*;
import java.util.*;

public class PropertyManager {

    private static String driverPathChrome;
    private static String driverPathGecko;
    private static String url;
    private static String password;
    private static String username;
    private static String wrongUsername;
    private static String wrongPassword;
    private static String itemName;

    public static PropertyManager getInstance() {
        Properties prop = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream file = new
                    FileInputStream("src/main/resources/configuration.properties");
            prop.load(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
        driverPathChrome = prop.getProperty("driverPathChrome");
        driverPathGecko = prop.getProperty("driverPathGecko");
        url = prop.getProperty("url");
        password = prop.getProperty("password");
        username = prop.getProperty("username");
        wrongUsername = prop.getProperty("wrongUsername");
        wrongPassword = prop.getProperty("wrongPassword");
        itemName = prop.getProperty("itemName");


        return instance;
    }

    public static void editProperty(String key, String value) {
        Properties editProp = new Properties();
        try {
        FileInputStream
            fi = new FileInputStream("src/main/resources/configuration.properties");
            editProp.load(fi);
            editProp.setProperty(key, value);
            editProp.store(new FileOutputStream("src/main/resources/configuration.properties"), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getDriverPathChrome(){
        return driverPathChrome;
    }
    public String getUrl(){
        return url;
    }
    public String getPassword(){
        return password;
    }
    public String getUsername(){
        return username;
    }
    public String getWrongUsername(){
        return wrongUsername;
    }
    public String getWrongPassword(){
        return wrongPassword;
    }
    public String getDriverPathGecko(){
        return driverPathGecko;
    }
    public String getItemName(){
        return itemName;
    }

    }



