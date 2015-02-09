package com.wksc.springdwr.entity;

/**
 * Created by gxb on 2015/2/5.
 */
//@Configuration
public class AppConfig {

   private String name;

//    public  String getName() {
//        return name;
//    }
//    @Value("#{configurer.name}")
    public  void setName(String name) {
        this.name = name;
    }
}
