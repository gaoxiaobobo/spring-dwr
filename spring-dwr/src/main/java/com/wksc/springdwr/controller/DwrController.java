package com.wksc.springdwr.controller;

import com.wksc.springdwr.entity.Dept;
import com.wksc.springdwr.services.HelloServices;
import org.directwebremoting.ServerContext;
import org.directwebremoting.ServerContextFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by gxb on 2015/2/3.
 */
@Controller
@RequestMapping("/hello")
public class DwrController {
    @Autowired
    private HelloServices service;

    @RequestMapping(value = "/sendMsg", method = RequestMethod.POST)
    @ResponseBody
    public Dept sendMsg(String name,Model model,HttpServletRequest request) {
        //获得DWR上下文
        ServletContext sc = request.getSession().getServletContext();
        ServerContext sctx = ServerContextFactory.get(sc);
        model.addAttribute("name", name);
        Dept d = new Dept();
        d.setId(1L);
        d.setName("xx");
        service.sendMsg(name,sctx);
        return d;
    }
}
