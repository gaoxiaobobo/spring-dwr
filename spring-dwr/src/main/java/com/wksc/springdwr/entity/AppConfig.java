package com.wksc.springdwr.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gxb on 2015/2/5.极大地
 *
 */
@Configuration
public class AppConfig {

   private String name;

    public  String getName() {
        return name;
    }
    @Value("#{configurer.name}")
    public  void setName(String name) {
        this.name = name;
    }
}
