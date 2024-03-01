package com.banking.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

     Properties properties;
    FileInputStream fis;

    public ReadConfig()
    {
        try {
            fis = new FileInputStream(System.getProperty("user.dir")+"/configuration/config.properties");
            properties=new Properties();
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e){
            e.getMessage();
        }

    }

    public  String getURL(){
        String url= properties.getProperty("URL");

        return url;
    }

    public String getUserName(){
        String username= properties.getProperty("username");

        return username;
    }
    public String getPassword(){
        String password= properties.getProperty("password");

        return password;
    }

    public String getChromePath(){
        String path= properties.getProperty("chromapath");
        return path;
    }

    public String getIEPath(){
       String path= properties.getProperty("IEpath");
       return path;
    }

}



