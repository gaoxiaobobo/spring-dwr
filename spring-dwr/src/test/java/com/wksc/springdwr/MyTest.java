package com.wksc.springdwr;

import com.wksc.springdwr.entity.AppConfig;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * Created by gxb on 2015/2/5.
 */
public class MyTest extends BaseJunit4Test {
//    @Autowired
//    private HelloServices services;
    @Autowired
    private AppConfig configurer;
    @Test
    public void showProperties(){
        System.out.println(configurer.getName());
//        services.sayHello("ddd");
    }
}
