package io.paysky.qc.app_modules.general_scenarios;


import io.paysky.qc.GlobalProperties;
import io.paysky.qc.utils.UserConfig;


public class GeneralLogin {


    public static void loginWithUser (){

        UserConfig userConfig=new UserConfig();
        userConfig.returnUserData(GlobalProperties.globalUserType);



        System.out.println(userConfig.userDataFromConfigFile.get("email"));
        System.out.println(userConfig.userDataFromConfigFile.get("password"));

        //TODO: Should handle different routing for different user

        /*

        if(merchant )
        should view pages(onboarding and login) and actions for merchant
         */


    }



}
