package com.wksc.springdwr.services;

import org.directwebremoting.*;
import org.directwebremoting.proxy.dwr.Util;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by gxb on 2015/2/3.
 */

@Service
public class HelloServices {
    public String sayHello(String name) {
        System.out.println("Hello now!");
        return "Hello " + name + "!";
    }
    @SuppressWarnings("deprecation")
    public void sendMsg(String msg,ServerContext context){
        Collection sessions = context.getScriptSessionsByPage("/dwr/showMsg.jsp");

        //不知道该怎么解释这个 ，
        Util util = new Util(sessions);

        //下面是创建一个javascript脚本 ， 相当于在页面脚本中添加了一句  show(msg);
        ScriptBuffer sb = new ScriptBuffer();
        sb.appendScript("show(");
        sb.appendData(msg);
        sb.appendScript(")");

        //推送
        util.addScript(sb);
    }
    @SuppressWarnings("deprecation")
    public void sendMsg(String msg){
        //得到上下文
        WebContext context1 = WebContextFactory.get();
            //得到要推送到 的页面  dwr3为项目名称 ， 一定要加上
        Collection<ScriptSession>  sessions = context1.getScriptSessionsByPage("/dwr/showMsg.jsp");

        //不知道该怎么解释这个 ，
        Util util = new Util(sessions);

        //下面是创建一个javascript脚本 ， 相当于在页面脚本中添加了一句  show(msg);
        ScriptBuffer sb = new ScriptBuffer();
        sb.appendScript("show(");
        sb.appendData(msg);
        sb.appendScript(")");

        //推送
        util.addScript(sb);
    }
}
