package cn.itcast.controller;

import cn.itcast.bean.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * DESCRIPTION:
 * STEPS:
 * SUMMARY:
 */
@RestController
@RequestMapping("user")
public class UserContorller {
    @Autowired //注入
    private UserService userService;

    @RequestMapping("/hello")//表示该类/方法可以接收/hello的请求
    public String hello(String name){
        System.out.println("hello " + name);
        return "hello " + name;
    }
    //需求1:接收post请求并保存数据到MySQL
    //url: localhost:8081/user/add
    //post请求的参数可以在方法体中
    //username=jack
    //password=888
    //nickname=jackma
    @RequestMapping("/add")
    public String add(User user){
        userService.save(user);
        return "sucess";
    }
    @RequestMapping("/findAll")
    public List<User> findAll(){
            return  userService.findAll();
    }
    @RequestMapping("/findById/{id}")
    public User findById(@PathVariable  Long id){
        return userService.findById( id);
    }
    //需求3:根据username和password查询
    @RequestMapping("/findByUsernameAndPassword/{username}/{password}")
    public List<User> findByUsernameAndPassword(@PathVariable String username,@PathVariable String password){
        return userService.findByUsernameAndPassword(username,password);
    }
    //需求4:根据username和password查询,并执行指定的sql
    @RequestMapping("/findBySQL/{username}/{password}")
    public List<User> findBySQL(@PathVariable String username,@PathVariable String password){
        return userService.findBySQL(username,password);
    }
}
