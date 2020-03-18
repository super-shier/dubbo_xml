package com.shier.dubbo;

import com.shier.dubbo.model.User;
import com.shier.dubbo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SpringBootApplication
@ImportResource("classpath:client-server.xml")
@RestController
public class DubboApp {
    @Resource
    private UserService userService;

    public static void main(String[] args) {
        SpringApplication.run(DubboApp.class, args);
    }

    @RequestMapping("/hello")
    public String helloWorld() {
        User user = new User();
        user.setAge(16);
        user.setDetail("哈哈哈哈");
        return userService.addUser(user);
    }
}
