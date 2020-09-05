package cn.itcast.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author itcast
 * Date 2020/8/10 15:07
 * Desc
 */
@RestController
//@Controller//表示该类会交给Spring/SpringBoot进行管理,能够接收用户请求并返回数据
//@ResponseBody//表示将返回的数据自动的转为json并返回
public class HelloController {
    @RequestMapping("/hello")//表示该类/方法可以接收/hello的请求
    public String hello(String name){
        System.out.println("hello " + name);
        return "hello " + name;
    }
}
