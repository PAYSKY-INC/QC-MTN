package io.paysky.qc;


import io.paysky.qc.utils.UserConfig;

import java.io.InputStream;
import java.util.Properties;

public class GlobalProperties {
    /***
     * This class is responsible for getting the properties file at resources folder
     * **/


    public static UserConfig.USERENUM globalUserType= UserConfig.USERENUM.ADMIN;
    public static Properties global_propertoes =  new Properties();
    public static String getProperty(String name) { return global_propertoes.getProperty(name);}


    public Properties getGlobalsValue() {
        Properties prop = new Properties();
        return prop;
    }
}
