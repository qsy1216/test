package com.itheima.controller;

import com.itheima.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "param")
public class ParamsController {
    @RequestMapping(path = "testParamsController")
    public String testParamsController(String username){
        System.out.println("执行了！！");
        System.out.println(username);
        return "success";
    }

    @RequestMapping("saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了 ");
        System.out.println(account);
        return "success";
    }

}
