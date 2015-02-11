package com.wksc.springdwr;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by gxb on 2015/2/5.
 */
@RunWith(SpringJUnit4ClassRunner.class)  //使用junit4进行测试
/**
 * 最好不要写通配符，比如app*.xml有可能就报错,"classpath:spring*.xml"
 */
@ContextConfiguration
        ({"classpath:applicationContext.xml","classpath:spring-servlet.xml"}) //加载配置文件
public class BaseJunit4Test {


}
