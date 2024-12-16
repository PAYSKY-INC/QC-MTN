package io.paysky.qc.utils;


import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

public class EnvironmentConfig {


//    public enum Env {
//        UAT_CUSTOMER,UAT_ADMIN,UAT_MERCHANT,
//        PREPROD_CUSTOMER, PREPROD_ADMIN,PREPROD_MERCHANT
//    }
//


    public enum Env {
        UAT, PREPROD
    }


    public static String getBaseUrl(UserConfig.USERENUM userenum) {
        String baseUrl = null;
        Env env = envStringToEnum();

        if (userenum == UserConfig.USERENUM.ADMIN && env == Env.UAT) {
            baseUrl = "https://marketuat.momo.africa:1019";
        } else if (userenum == UserConfig.USERENUM.ADMIN && env == Env.PREPROD) {
            baseUrl = "https://momomarketstg.africa/Admin/auth";
        }
        else if (userenum == UserConfig.USERENUM.MERCHANT && env == Env.UAT) {
            baseUrl = "https://marketuat.momo.africa:2024";
        } else if (userenum == UserConfig.USERENUM.MERCHANT && env == Env.PREPROD) {
            baseUrl = "https://momomarketstg.africa/MA/?tenantId=1";
        } else if (userenum == UserConfig.USERENUM.CONSUMER && env == Env.UAT) {
            baseUrl = "https://marketuat.momo.africa:1018/login";
        } else if (userenum == UserConfig.USERENUM.CONSUMER && env == Env.PREPROD) {
            baseUrl = "https://momomarketstg.africa/Portal/";
        }

        return baseUrl;
    }

    public static Env envStringToEnum() {
        try {
            return Env.valueOf(getEnv());
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Error " + getEnv());
        }
    }


    public static String getEnv() {
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

        return properties.getProperty("environment").toUpperCase(Locale.ROOT);
    }


}
