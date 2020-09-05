package cn.itcast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Author itcast
 * Date 2020/8/10 15:03
 * Desc
 */

@SpringBootApplication//该注解表示该项目为一个SpringBoot项目
public class SpringBootHelloApplication {
    public static void main(String[] args) {
        //表示启动main的时候
        //调用SpringApplication的run方法启动springboot项目
        SpringApplication.run(SpringBootHelloApplication.class, args);
    }
}
