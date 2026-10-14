package com.carlospinales.ordersystem.config;

public class AppConfig {

    /*Constructor private: nadie fuera de la clase puede usar new
    * Un atributo static con la unica intancia. static significa que pertenece a la case*/
    private static final AppConfig INSTANCE = new AppConfig();

    private final String currency;

    private AppConfig(){
        System.out.println("Loading configuration...");
        this.currency = "MXN";
    }

    public static AppConfig getInstance(){
        return INSTANCE;
    }

    public String getCurrency(){
        return currency;
    }


}
