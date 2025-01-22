package io.paysky.qc.utils;

import io.paysky.qc.GlobalProperties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;

public class UserConfig {




    public static void  setUserType(USERENUM userenum){
        GlobalProperties.globalUserType= userenum;
    }

    public HashMap<String, String> userDataFromConfigFile = new HashMap<String, String>();

    public enum USERENUM {
        ADMIN,OPERATION, MERCHANT,CONSUMER,

    }

//TODO: Handle config for environment with this file
    public HashMap<String, String> returnUserData( USERENUM userEnum){
        FileInputStream inputStream;
        Properties properties;
        File propFile = new File("src/main/resources/config.properties");
        try {
            inputStream = new FileInputStream(propFile);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        properties = new Properties();
        try {
            properties.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        if(userEnum == USERENUM.ADMIN){
            userDataFromConfigFile.put("email", properties.getProperty("admin"));
            userDataFromConfigFile.put("password", properties.getProperty("adminPassword"));
            GlobalProperties.globalUserType=USERENUM.ADMIN;
            return userDataFromConfigFile;
        }
        else if (userEnum == USERENUM.MERCHANT) {
            userDataFromConfigFile.put("email", properties.getProperty("merchant"));
            userDataFromConfigFile.put("password", properties.getProperty("merchantPassword"));
            GlobalProperties.globalUserType=USERENUM.MERCHANT;
            return userDataFromConfigFile;
        }

        else if (userEnum == USERENUM.OPERATION) {
            userDataFromConfigFile.put("email", properties.getProperty("operation"));
            userDataFromConfigFile.put("password", properties.getProperty("operationPassword"));
            GlobalProperties.globalUserType=USERENUM.OPERATION;
            return userDataFromConfigFile;
        }

        else if (userEnum == USERENUM.CONSUMER) {
            userDataFromConfigFile.put("email", properties.getProperty("consumer"));
            userDataFromConfigFile.put("password", properties.getProperty("consumerPassword"));
            GlobalProperties.globalUserType=USERENUM.CONSUMER;
            return userDataFromConfigFile;
        }

return null;
    }


}
