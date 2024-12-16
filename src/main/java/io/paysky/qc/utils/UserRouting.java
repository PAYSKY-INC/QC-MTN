package io.paysky.qc.utils;

import io.paysky.qc.GlobalProperties;

public class UserRouting extends BaseTest{


    //TODO: Should fix this and remove the routing

    public static void selectUserType(UserConfig.USERENUM userType){
        UserConfig.setUserType(userType);
        driver.get(EnvironmentConfig.getBaseUrl(GlobalProperties.globalUserType));

    }
}
